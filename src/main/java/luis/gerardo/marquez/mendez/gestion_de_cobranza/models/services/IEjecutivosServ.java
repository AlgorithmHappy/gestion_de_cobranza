package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Ejecutivos;

public interface IEjecutivosServ {
    public List<Ejecutivos> getAllEjecutivos();
    public List<Ejecutivos> getByEstadoAgente(int estado, int agente);
}
