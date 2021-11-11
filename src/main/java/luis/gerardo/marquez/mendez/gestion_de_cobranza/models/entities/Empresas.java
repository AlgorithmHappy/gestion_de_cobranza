package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "empresas")
@Entity
public class Empresas {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "razon_social")
    private String razonSocial;


    public Empresas() {
    }

    public Empresas(int id, String razonSocial) {
        this.id = id;
        this.razonSocial = razonSocial;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String nombreCompleto) {
        this.razonSocial = nombreCompleto;
    }
}
