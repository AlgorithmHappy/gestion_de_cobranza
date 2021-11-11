package luis.gerardo.marquez.mendez.gestion_de_cobranza.models;

import java.util.List;
import java.util.stream.Collectors;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Ejecutivos;

public class EjecutivosAux {
    private int id;

    private String nombreCompleto;

    public EjecutivosAux() {
    }

    public EjecutivosAux(Ejecutivos ejecutivo) {
        this.id = ejecutivo.getId();
        this.nombreCompleto = ejecutivo.getNombreCompleto();
    }

    public EjecutivosAux(int id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    // Conversor de listas
    public static List<EjecutivosAux> ejecutivosToEjecutivosAux(List<Ejecutivos> ejecutivos){
        return ejecutivos.stream()
            .map(it -> new EjecutivosAux(it))
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
