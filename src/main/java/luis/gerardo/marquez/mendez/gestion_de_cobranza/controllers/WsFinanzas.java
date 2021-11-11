package luis.gerardo.marquez.mendez.gestion_de_cobranza.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.DatosDePagosAux;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Agentes;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Colores;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Ejecutivos;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.EquivalenciaDeMonedas;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Estados;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Monedas;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IAgentesServ;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IColoresServ;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IDatosPagoServ;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IEjecutivosServ;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IEquivalenciaMonedasServ;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IEstadosServ;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services.IMonedasServ;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/WsFinanzas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class WsFinanzas {
    @Autowired
    @Qualifier("DatosPagosServ")
    IDatosPagoServ datosPagosServ;

    @Autowired
    @Qualifier("EstadosServ")
    IEstadosServ estadosServ;

    @Autowired
    @Qualifier("AgentesServ")
    IAgentesServ agentesServ;

    @Autowired
    @Qualifier("EjecutivosServ")
    IEjecutivosServ ejecServ;

    @Autowired
    @Qualifier("MonedasServ")
    IMonedasServ monServ;

    @Autowired
    @Qualifier("ColoresServ")
    IColoresServ colServ;

    @Autowired
    @Qualifier("EquivalenciaMonedasServ")
    IEquivalenciaMonedasServ equiMon;

    @GetMapping("/getAllDatos")
    public List<DatosDePagosAux> getAllDatos() {
        return datosPagosServ.getAll();
    }

    @GetMapping("/getDatosPagosByEstado")
    public List<DatosDePagosAux> getDatosPagosByEstado(@RequestParam int id_oficina) {
        return datosPagosServ.getByOficina(id_oficina);
    }

    @GetMapping("/getDatosPagosByEstadoAgente")
    public List<DatosDePagosAux> getDatosPagosByEstadoAgente(@RequestParam int id_oficina, @RequestParam int id_agente) {
        return datosPagosServ.getByOficinaAgente(id_oficina, id_agente);
    }

    @GetMapping("/getDatosPagosByEstadoAgenteEjecutivo")
    public List<DatosDePagosAux> getDatosPagosByEstadoAgenteEjecutivo(@RequestParam int id_oficina, @RequestParam int id_agente, @RequestParam int id_ejecutivo) {
        return datosPagosServ.getByOficinaAgenteEjecutivo(id_oficina, id_agente, id_ejecutivo);
    }
    
    @GetMapping("/getAllEstados")
    public List<Estados> getAllEstados() {
        return estadosServ.getAllEstados();
    }

    @GetMapping("/getAgentesByEstado")
    public List<Agentes> getAgentesByEstado(@RequestParam int id_estado) {
        return agentesServ.getByEstado(id_estado);
    }

    @GetMapping("/getAllAgentes")
    public List<Agentes> getAllAgentes() {
        return agentesServ.getAll();
    }

    @GetMapping("/getEjecutivosByEstadoAndId")
    public List<Ejecutivos> getEjecutivosByEstadoAndId(@RequestParam int id_estado, @RequestParam int id_agente) {
        return ejecServ.getByEstadoAgente(id_estado, id_agente);
    }

    @GetMapping("/getAllMonedas")
    public List<Monedas> getAllMonedas() {
        return monServ.getAll();
    }

    @GetMapping("/getAllEquivalenciaMonedas")
    public List<EquivalenciaDeMonedas> getAllEquivalenciaMonedas() {
        return equiMon.getAll();
    }

    @PostMapping("/getColores")
    public List<Colores> getColores(@RequestBody List<String> colores) {
        return colServ.getByColors(colores);
    }
}
