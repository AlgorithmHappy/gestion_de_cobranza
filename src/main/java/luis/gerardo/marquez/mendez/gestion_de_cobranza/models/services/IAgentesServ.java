package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.services;

import java.util.List;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Agentes;

public interface IAgentesServ {
    public List<Agentes> getAll();
    public List<Agentes> getByEstado(int id);
}
