package luis.gerardo.marquez.mendez.gestion_de_cobranza.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "relacion_ejecutivo_agente_datos_de_pagos")
@Entity
public class RelacionEjecutivoAgenteDatosDePago {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ejecutivo")
    private int ejecutivo;

    @Column(name = "agente")
    private int agente;

    @Column(name = "datos_de_pago")
    private String datosDePago;

    public RelacionEjecutivoAgenteDatosDePago() {
    }

    public RelacionEjecutivoAgenteDatosDePago(int id, int ejecutivo, int agente, String datosDePago) {
        this.id = id;
        this.ejecutivo = ejecutivo;
        this.agente = agente;
        this.datosDePago = datosDePago;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEjecutivo() {
        return this.ejecutivo;
    }

    public void setEjecutivo(int ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public int getAgente() {
        return this.agente;
    }

    public void setAgente(int agente) {
        this.agente = agente;
    }

    public String getDatosDePago() {
        return this.datosDePago;
    }

    public void setDatosDePago(String datosDePago) {
        this.datosDePago = datosDePago;
    }
}
