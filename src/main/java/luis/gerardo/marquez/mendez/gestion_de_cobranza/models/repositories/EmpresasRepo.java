package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Empresas;

@Repository("EmpresasRepo")
public interface EmpresasRepo extends JpaRepository<Empresas, Serializable>{
    public abstract Empresas findById(int id);
}
