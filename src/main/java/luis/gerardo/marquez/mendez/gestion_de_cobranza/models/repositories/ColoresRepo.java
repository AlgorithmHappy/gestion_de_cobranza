package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Colores;

@Repository("ColoresRepo")
public interface ColoresRepo extends JpaRepository<Colores, Serializable>{
    public abstract List<Colores> findByNombreDeColorIn(List<String> nombreDeColores);
    public abstract Colores findById(Integer id);
}
