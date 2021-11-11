package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "datos_de_pagos")
@Entity
public class DatosDePagos {
    @Column(name = "fianza")
    @Id
    private String fianza;

    @Column(name = "movimiento")
    private int movimiento;

    @Column(name = "fiado")
    private int fiado;

    @Column(name = "antiguedad")
    private int antiguedad;
    
    @Column(name = "dias_vencimiento")
    private int diasVencimiento;

    @Column(name = "importe")
    private double importe;

    @Column(name = "moneda")
    private int moneda;

    @Column(name = "color")
    private int color;

    @Column(name = "oficina")
    private int oficina;

    public DatosDePagos() {
    }

    public DatosDePagos(String fianza, int movimiento, int fiado, int antiguedad, int diasVencimiento, double importe, int moneda, int color, int oficina) {
        this.fianza = fianza;
        this.movimiento = movimiento;
        this.fiado = fiado;
        this.antiguedad = antiguedad;
        this.diasVencimiento = diasVencimiento;
        this.importe = importe;
        this.moneda = moneda;
        this.color = color;
        this.oficina = oficina;
    }


    public String getFianza() {
        return this.fianza;
    }

    public void setFianza(String fianza) {
        this.fianza = fianza;
    }

    public int getMovimiento() {
        return this.movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getFiado() {
        return this.fiado;
    }

    public void setFiado(int fiado) {
        this.fiado = fiado;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getDiasVencimiento() {
        return this.diasVencimiento;
    }

    public void setDiasVencimiento(int diasVencimiento) {
        this.diasVencimiento = diasVencimiento;
    }

    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getMoneda() {
        return this.moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getOficina() {
        return this.oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

}
