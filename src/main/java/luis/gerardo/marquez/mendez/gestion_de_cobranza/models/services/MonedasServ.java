package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Monedas;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.MonedasRepo;

@Service("MonedasServ")
public class MonedasServ implements IMonedasServ{
    @Autowired
    @Qualifier("MonedasRepo")
    MonedasRepo repo;

    @Override
    public Monedas getById(int id) {
        return repo.getById(id);
    }

    @Override
    public List<Monedas> getAll() {
        return repo.findAll();
    }
    
}
