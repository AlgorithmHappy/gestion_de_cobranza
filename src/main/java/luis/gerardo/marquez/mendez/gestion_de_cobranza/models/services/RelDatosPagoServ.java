package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.RelacionEjecutivoAgenteDatosDePago;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.RelacionEjAgDatosPagoRepo;

@Service("RelDatosPagoServ")
public class RelDatosPagoServ implements IRelDatosPagoServ{
    @Autowired
    @Qualifier("RelacionEjAgDatosPagoRepo")
    private RelacionEjAgDatosPagoRepo repo;

    @Override
    public List<RelacionEjecutivoAgenteDatosDePago> getByDatosPagosIds(List<String> idsDatosPagos) {
        return repo.findByDatosDePagoIn(idsDatosPagos);
    }

    @Override
    public List<RelacionEjecutivoAgenteDatosDePago> getByDatosPagosIdsAndAgente(List<String> idsDatosPagos,
            int agente) {
        
        return repo.findByDatosDePagoInAndAgente(idsDatosPagos, agente);
    }

    @Override
    public List<RelacionEjecutivoAgenteDatosDePago> getByDatosPagosIdsAndAgenteAndEjecutivo(List<String> idsDatosPagos,
            int agente, int ejecutivo) {

        return repo.findByDatosDePagoInAndAgenteAndEjecutivo(idsDatosPagos, agente, ejecutivo);
    }
    
}
