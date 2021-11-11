package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Colores;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.ColoresRepo;

@Service("ColoresServ")
public class ColoresServ implements IColoresServ{
    @Autowired
    @Qualifier("ColoresRepo")
    ColoresRepo repo;

    @Override
    public Colores getById(int id) {
        return repo.findById(id);
    }

    @Override
    public List<Colores> getByColors(List<String> colors) {
        return repo.findByNombreDeColorIn(colors);
    }
    
}
