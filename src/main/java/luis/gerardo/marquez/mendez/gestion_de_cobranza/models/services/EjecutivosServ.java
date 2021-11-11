package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.DatosDePagosAux;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Ejecutivos;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.RelacionEjecutivoAgenteDatosDePago;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.EjecutivosRepo;

@Service("EjecutivosServ")
public class EjecutivosServ implements IEjecutivosServ{

    @Autowired
    @Qualifier("EjecutivosRepo")
    private EjecutivosRepo repo;

    @Autowired
    @Qualifier("DatosPagosServ")
    private IDatosPagoServ datosPagoServ;

    @Autowired
    @Qualifier("RelDatosPagoServ")
    private IRelDatosPagoServ relDatosPaid;

    @Override
    public List<Ejecutivos> getAllEjecutivos() {
        return repo.findAll();
    }

    @Override
    public List<Ejecutivos> getByEstadoAgente(int id, int agente_id) {
        List<DatosDePagosAux> arrDatos = datosPagoServ.getByOficina(id);
        
        List<String> idsDatosPag = arrDatos.stream()
                                    .map(it -> it.getFianza())
                                    .distinct()
                                    .collect(Collectors.toList());
        
        List<RelacionEjecutivoAgenteDatosDePago> arrRelacion = relDatosPaid.getByDatosPagosIds(idsDatosPag);

        List<Integer> arrIdsEjecutivos = arrRelacion.stream()
                                        .filter(it -> it.getAgente() == agente_id)
                                        .map(it -> it.getEjecutivo())
                                        .distinct()
                                        .collect(Collectors.toList());

        
        return repo.findByIdIn(arrIdsEjecutivos);
    }
    
}
