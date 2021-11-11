package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Colores;

public interface IColoresServ {
    public List<Colores> getByColors(List<String> colors);
    public Colores getById(int id);
}
