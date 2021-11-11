package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.DatosDePagosAux;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Agentes;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.RelacionEjecutivoAgenteDatosDePago;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.AgentesRepo;

@Service("AgentesServ")
public class AgentesServ implements IAgentesServ{

    @Autowired
    @Qualifier("AgentesRepo")
    private AgentesRepo repo;

    @Autowired
    @Qualifier("DatosPagosServ")
    private IDatosPagoServ datosPagoServ;

    @Autowired
    @Qualifier("RelDatosPagoServ")
    private IRelDatosPagoServ relDatosPaid;

    @Override
    public List<Agentes> getAll() {
        return repo.findAll();
    }

    @Override
    public List<Agentes> getByEstado(int id) {
        List<DatosDePagosAux> arrDatos = datosPagoServ.getByOficina(id);
        
        List<String> idsDatosPag = arrDatos.stream()
                                    .map(it -> it.getFianza())
                                    .distinct()
                                    .collect(Collectors.toList());
        
        List<RelacionEjecutivoAgenteDatosDePago> arrRelacion = relDatosPaid.getByDatosPagosIds(idsDatosPag);

        List<Integer> idsAgentes = arrRelacion.stream()
                                   .map(it -> it.getAgente())
                                   .distinct()
                                   .collect(Collectors.toList());

        
        return this.repo.findByIdIn(idsAgentes);
    }
    
}
