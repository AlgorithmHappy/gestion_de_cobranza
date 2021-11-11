package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.TiposDeMovimientos;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.TiposDeMovRepo;

@Service("TiposDeMovServ")
public class TiposDeMovServ implements ITiposDeMovServ{
    @Autowired
    @Qualifier("TiposDeMovRepo")
    private TiposDeMovRepo repo;

    @Override
    public TiposDeMovimientos getById(int id) {
        return repo.findById(id);
    }
    
}
