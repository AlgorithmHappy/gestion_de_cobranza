package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.EquivalenciaDeMonedas;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Monedas;

@Repository("EquivalenciaMonedasRepo")
public interface EquivalenciaMonedasRepo extends JpaRepository<EquivalenciaDeMonedas, Serializable>{
    public abstract EquivalenciaDeMonedas findById(int id);
    public abstract List<EquivalenciaDeMonedas> findAll();
    public abstract EquivalenciaDeMonedas findByMonedaBaseAndMonedaAConvertir(Monedas monedaBase, Monedas monedaAConvertir);
}
