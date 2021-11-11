package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.DatosDePagos;

@Repository("DatosPagoRepo")
public interface DatosPagoRepo extends JpaRepository<DatosDePagos, Serializable> {
    public abstract List<DatosDePagos> findByOficina(int estado);
    public abstract DatosDePagos findByFianza(String fianza);
    public abstract List<DatosDePagos> findAll();
}
