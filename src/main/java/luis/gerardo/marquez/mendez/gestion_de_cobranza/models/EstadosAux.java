package luis.gerardo.marquez.mendez.gestion_de_cobranza.models;

import java.util.List;
import java.util.stream.Collectors;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities.Estados;

public class EstadosAux {
    private int id;

    private String nombreDeEstado;

    public EstadosAux() {
    }

    public EstadosAux(Estados estado) {
        this.id = estado.getId();
        this.nombreDeEstado = estado.getNombreDeEstado();
    }

    public EstadosAux(int id, String nombreDeEstado) {
        this.id = id;
        this.nombreDeEstado = nombreDeEstado;
    }

    // Conversor de listas de Estados a EstadosAux
    public static List<EstadosAux> estadosToEstadosAux(List<Estados> estados){
        return estados.stream() // Recorre el arreglo
            .map(it -> new EstadosAux(it)) // Conviertelo a EstadosAux
            .collect(Collectors.toList()); // Devuelve una lista de todos los objetos recorridos
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDeEstado() {
        return this.nombreDeEstado;
    }

    public void setNombreDeEstado(String nombreDeEstado) {
        this.nombreDeEstado = nombreDeEstado;
    }    
}
