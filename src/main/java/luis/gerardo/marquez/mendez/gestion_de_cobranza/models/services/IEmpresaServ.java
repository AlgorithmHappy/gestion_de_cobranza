package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Empresas;

public interface IEmpresaServ {
    public Empresas getById(int id);
}
