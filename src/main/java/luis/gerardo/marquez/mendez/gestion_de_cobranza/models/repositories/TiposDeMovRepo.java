package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.TiposDeMovimientos;

@Repository("TiposDeMovRepo")
public interface TiposDeMovRepo extends JpaRepository<TiposDeMovimientos, Serializable>{
    public abstract TiposDeMovimientos findById(int id);
    public abstract TiposDeMovimientos findByTipoDeMovimiento(String tipoDeMovimiento);
}
