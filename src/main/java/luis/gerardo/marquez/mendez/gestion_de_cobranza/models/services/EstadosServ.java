package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Estados;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.EstadosRepo;

@Service("EstadosServ")
public class EstadosServ implements IEstadosServ{

    @Autowired
    @Qualifier("EstadosRepo")
    private EstadosRepo repo;

    @Override
    public List<Estados> getAllEstados() {
        return repo.findAll();
    }
    
}
