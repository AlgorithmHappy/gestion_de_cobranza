package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "equivalencias_de_monedas")
@Entity
public class EquivalenciaDeMonedas {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "moneda_base")
    private int monedaBase;

    @Column(name = "moneda_a_convertir")
    private int monedaAConvertir;

    @Column(name = "valor_unitario")
    private double valorUnitario;

    public EquivalenciaDeMonedas() {
    }

    public EquivalenciaDeMonedas(int id, int monedaBase, int monedaAConvertir, double valorUnitario) {
        this.id = id;
        this.monedaBase = monedaBase;
        this.monedaAConvertir = monedaAConvertir;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonedaBase() {
        return this.monedaBase;
    }

    public void setMonedaBase(int monedaBase) {
        this.monedaBase = monedaBase;
    }

    public int getMonedaAConvertir() {
        return this.monedaAConvertir;
    }

    public void setMonedaAConvertir(int monedaAConvertir) {
        this.monedaAConvertir = monedaAConvertir;
    }

    public double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
