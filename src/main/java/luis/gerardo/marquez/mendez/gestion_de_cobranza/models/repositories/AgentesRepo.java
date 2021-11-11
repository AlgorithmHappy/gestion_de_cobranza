package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Agentes;

@Repository("AgentesRepo")
public interface AgentesRepo extends JpaRepository<Agentes, Serializable>{
    public abstract List<Agentes> findAll();
    public abstract List<Agentes> findByIdIn(List<Integer> ids);
    public abstract Agentes findById(Integer id);
}
