package luis.gerardo.marquez.mendez.gestion_de_cobranza.models;

import java.util.List;
import java.util.stream.Collectors;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Agentes;

public class AgentesAux {
    private int id;

    private String nombreCompleto;

    public AgentesAux() {
    }

    public AgentesAux(Agentes it) {
        this.id = it.getId();
        this.nombreCompleto = it.getNombreCompleto();
    }

    public AgentesAux(int id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    // Conversor de listas
    public static List<AgentesAux> agentesToAgentesAux(List<Agentes> agentes){
        return agentes.stream()
            .map(it -> new AgentesAux(it))
            .collect(Collectors.toList());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
