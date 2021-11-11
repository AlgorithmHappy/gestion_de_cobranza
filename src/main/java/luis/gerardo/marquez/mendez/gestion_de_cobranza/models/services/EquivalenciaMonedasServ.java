package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.EquivalenciaDeMonedas;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.EquivalenciaMonedasRepo;

@Service("EquivalenciaMonedasServ")
public class EquivalenciaMonedasServ implements IEquivalenciaMonedasServ{

    @Autowired
    @Qualifier("EquivalenciaMonedasRepo")
    EquivalenciaMonedasRepo repo; 

    @Override
    public List<EquivalenciaDeMonedas> getAll() {
        return repo.findAll();
    }
    
}
