package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Estados;

@Repository("EstadosRepo")
public interface EstadosRepo extends JpaRepository<Estados, Serializable> {
    public abstract List<Estados> findAll();
    public abstract Estados findById(int id);
}
