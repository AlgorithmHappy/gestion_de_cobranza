package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import luis.gerardo.marquez.mendez.gestion_de_cobranza.models.EstadosAux;

@Table(name = "estados")
@Entity
public class Estados {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_de_estado")
    private String nombreDeEstado;

    public Estados() {
    }

    public Estados(EstadosAux estado){
        this.id = estado.getId();
        this.nombreDeEstado = estado.getNombreDeEstado();
    }

    public Estados(int id, String nombreDeEstado) {
        this.id = id;
        this.nombreDeEstado = nombreDeEstado;
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
