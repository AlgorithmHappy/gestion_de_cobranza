package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.DatosDePagosAux;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.DatosDePagos;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.RelacionEjecutivoAgenteDatosDePago;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.DatosPagoRepo;

@Service("DatosPagosServ")
public class DatosPagosServ implements IDatosPagoServ{
    @Autowired
    @Qualifier("DatosPagoRepo")
    private DatosPagoRepo repoDatosPago;

    @Autowired
    @Qualifier("TiposDeMovServ")
    private ITiposDeMovServ movServ;

    @Autowired
    @Qualifier("EmpresaServ")
    private IEmpresaServ emprServ;

    @Autowired
    @Qualifier("MonedasServ")
    private IMonedasServ monServ;
    
    @Autowired
    @Qualifier("ColoresServ")
    private IColoresServ colServ;

    @Autowired
    @Qualifier("RelDatosPagoServ")
    private IRelDatosPagoServ relacionServ;

    @Override
    public List<DatosDePagosAux> getByOficina(int id) {
        List<DatosDePagos> arrDatosDePago = repoDatosPago.findByOficina(id);

        List<DatosDePagosAux> arrDatosDePagoAux = new ArrayList<>();

        for(DatosDePagos it : arrDatosDePago){
            String fianza = it.getFianza();
            String movimiento = this.movServ.getById(it.getMovimiento()).getTipoDeMovimiento();
            String fiado = this.emprServ.getById(it.getFiado()).getRazonSocial();
            int antiguedad = it.getAntiguedad();
            int diasVencimiento = it.getDiasVencimiento();
            double importe = it.getImporte();
            String moneda = this.monServ.getById(it.getMoneda()).getTipoDeMoneda();
            String color = this.colServ.getById(it.getColor()).getNombreDeColor();

            arrDatosDePagoAux.add(new DatosDePagosAux(fianza, movimiento, fiado, antiguedad, diasVencimiento, importe, moneda, color));
        }

        return arrDatosDePagoAux;
    }

    @Override
    public List<DatosDePagosAux> getAll() {
        List<DatosDePagos> arrDatosDePago = this.repoDatosPago.findAll();

        List<DatosDePagosAux> arrDatosDePagoAux = new ArrayList<>();

        for(DatosDePagos it : arrDatosDePago){
            String fianza = it.getFianza();
            String movimiento = this.movServ.getById(it.getMovimiento()).getTipoDeMovimiento();
            String fiado = this.emprServ.getById(it.getFiado()).getRazonSocial();
            int antiguedad = it.getAntiguedad();
            int diasVencimiento = it.getDiasVencimiento();
            double importe = it.getImporte();
            String moneda = this.monServ.getById(it.getMoneda()).getTipoDeMoneda();
            String color = this.colServ.getById(it.getColor()).getNombreDeColor();

            arrDatosDePagoAux.add(new DatosDePagosAux(fianza, movimiento, fiado, antiguedad, diasVencimiento, importe, moneda, color));
        }

        return arrDatosDePagoAux;
    }

    @Override
    public List<DatosDePagosAux> getByOficinaAgente(int estado, int agente) {
        List<DatosDePagos> arrDatosDePago = this.repoDatosPago.findByOficina(estado);

        List<String> idsDatos = arrDatosDePago.stream()
            .map(it -> it.getFianza())
            .distinct()
            .collect(Collectors.toList());

        List<RelacionEjecutivoAgenteDatosDePago> relaciones = this.relacionServ.getByDatosPagosIdsAndAgente(idsDatos, agente);
        
        List<String> idsDatosAgente = relaciones.stream()
            .filter(it -> it.getAgente() == agente)
            .distinct()
            .map(it -> it.getDatosDePago())
            .collect(Collectors.toList());

        List<DatosDePagos> arrDatosDePagoFiltrado = arrDatosDePago.stream()
            .filter(it -> idsDatosAgente.contains(it.getFianza()))
            .collect(Collectors.toList());
        
        List<DatosDePagosAux> arrDatosDePagoAux = new ArrayList<>();

        for(DatosDePagos it : arrDatosDePagoFiltrado){
            String fianza = it.getFianza();
            String movimiento = this.movServ.getById(it.getMovimiento()).getTipoDeMovimiento();
            String fiado = this.emprServ.getById(it.getFiado()).getRazonSocial();
            int antiguedad = it.getAntiguedad();
            int diasVencimiento = it.getDiasVencimiento();
            double importe = it.getImporte();
            String moneda = this.monServ.getById(it.getMoneda()).getTipoDeMoneda();
            String color = this.colServ.getById(it.getColor()).getNombreDeColor();
    
            arrDatosDePagoAux.add(new DatosDePagosAux(fianza, movimiento, fiado, antiguedad, diasVencimiento, importe, moneda, color));
        }

        return arrDatosDePagoAux;
    }

    @Override
    public List<DatosDePagosAux> getByOficinaAgenteEjecutivo(int oficina, int agente, int ejecutivo) {
        List<DatosDePagos> arrDatosDePago = this.repoDatosPago.findByOficina(oficina);

        List<String> idsDatos = arrDatosDePago.stream()
            .map(it -> it.getFianza())
            .distinct()
            .collect(Collectors.toList());

        List<RelacionEjecutivoAgenteDatosDePago> relaciones = this.relacionServ.getByDatosPagosIdsAndAgenteAndEjecutivo(idsDatos, agente, ejecutivo);

        List<String> idsDatosAgEj = relaciones.stream()
            .map(it -> it.getDatosDePago())
            .distinct()
            .collect(Collectors.toList());

        List<DatosDePagos> arrDatosDePagoFiltrado = arrDatosDePago.stream()
            .filter(it -> idsDatosAgEj.contains(it.getFianza()))
            .distinct()
            .collect(Collectors.toList());

        List<DatosDePagosAux> arrDatosDePagoAux = new ArrayList<>();

        for(DatosDePagos it : arrDatosDePagoFiltrado){
            String fianza = it.getFianza();
            String movimiento = this.movServ.getById(it.getMovimiento()).getTipoDeMovimiento();
            String fiado = this.emprServ.getById(it.getFiado()).getRazonSocial();
            int antiguedad = it.getAntiguedad();
            int diasVencimiento = it.getDiasVencimiento();
            double importe = it.getImporte();
            String moneda = this.monServ.getById(it.getMoneda()).getTipoDeMoneda();
            String color = this.colServ.getById(it.getColor()).getNombreDeColor();
        
            arrDatosDePagoAux.add(new DatosDePagosAux(fianza, movimiento, fiado, antiguedad, diasVencimiento, importe, moneda, color));
        }

        return arrDatosDePagoAux;
    }

}
