package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.RelacionEjecutivoAgenteDatosDePago;

@Repository("RelacionEjAgDatosPagoRepo")
public interface RelacionEjAgDatosPagoRepo extends JpaRepository<RelacionEjecutivoAgenteDatosDePago, Serializable>{
    public abstract RelacionEjecutivoAgenteDatosDePago findByDatosDePago(String datosDePagos);
    public abstract List<RelacionEjecutivoAgenteDatosDePago> findByDatosDePagoIn(List<String> datosDePago);
    public abstract List<RelacionEjecutivoAgenteDatosDePago> findByDatosDePagoInAndAgente(List<String> datosDePago, int agente);
    public abstract List<RelacionEjecutivoAgenteDatosDePago> findByDatosDePagoInAndAgenteAndEjecutivo(List<String> datosDePago, int agente, int ejecutivo);
}
