package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Monedas;


@Repository("MonedasRepo")
public interface MonedasRepo extends JpaRepository<Monedas, Serializable>{
    public abstract Monedas findByTipoDeMoneda(String tipoDeMoneda);
    public abstract Monedas findById(int id);
    public abstract List<Monedas> findAll();
}
