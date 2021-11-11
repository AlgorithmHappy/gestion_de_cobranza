package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "colores")
@Entity
public class Colores {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre_de_color")
    private String nombreDeColor;

    @Column(name = "codigo_hexadecimal")
    private String codigoHexadecimal;

    public Colores() {
    }

    public Colores(int id, String nombreDeColor, String codigoHexadecimal) {
        this.id = id;
        this.nombreDeColor = nombreDeColor;
        this.codigoHexadecimal = codigoHexadecimal;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDeColor() {
        return this.nombreDeColor;
    }

    public void setNombreDeColor(String nombreDeColor) {
        this.nombreDeColor = nombreDeColor;
    }

    public String getCodigoHexadecimal() {
        return this.codigoHexadecimal;
    }

    public void setCodigoHexadecimal(String codigoHexadecimal) {
        this.codigoHexadecimal = codigoHexadecimal;
    }

}
