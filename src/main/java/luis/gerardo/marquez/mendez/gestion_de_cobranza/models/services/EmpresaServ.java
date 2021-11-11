package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Empresas;
import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.repositories.EmpresasRepo;

@Service("EmpresaServ")
public class EmpresaServ implements IEmpresaServ{
    @Autowired
    @Qualifier("EmpresasRepo")
    EmpresasRepo repo;

    @Override
    public Empresas getById(int id) {
        return repo.getById(id);
    }
    
}
