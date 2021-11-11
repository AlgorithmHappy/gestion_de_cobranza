package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Ejecutivos;

@Repository("EjecutivosRepo")
public interface EjecutivosRepo extends JpaRepository<Ejecutivos, Serializable>{
    public abstract List<Ejecutivos> findAll();
    //public abstract Ejecutivos findById(int id);
    public abstract List<Ejecutivos> findByIdIn(List<Integer> ids);
}
