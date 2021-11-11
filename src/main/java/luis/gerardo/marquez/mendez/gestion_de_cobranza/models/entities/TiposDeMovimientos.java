package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tipos_de_movimientos")
@Entity
public class TiposDeMovimientos {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_de_movimiento")
    private String tipoDeMovimiento;


    public TiposDeMovimientos() {
    }

    public TiposDeMovimientos(int id, String tipoDeMovimiento) {
        this.id = id;
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeMovimiento() {
        return this.tipoDeMovimiento;
    }

    public void setTipoDeMovimiento(String tipoDeMovimiento) {
        this.tipoDeMovimiento = tipoDeMovimiento;
    }

}
