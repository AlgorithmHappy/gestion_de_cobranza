package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Monedas;

public interface IMonedasServ {
    public Monedas getById(int id);
    public List<Monedas> getAll();
}
