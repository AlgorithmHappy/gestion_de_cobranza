package luis.gerardo.marquez.mendez.gestion_de_cobranza.models;

public class DatosDePagosAux {
    private String fianza;
    private String movimiento;
    private String fiado;
    private int antiguedad;
    private int diasVencimiento;
    private double importe;
    private String moneda;
    private String color;

    public DatosDePagosAux() {
    }

    public DatosDePagosAux(String fianza, String movimiento, String fiado, int antiguedad, int diasVencimiento, double importe, String moneda, String color) {
        this.fianza = fianza;
        this.movimiento = movimiento;
        this.fiado = fiado;
        this.antiguedad = antiguedad;
        this.diasVencimiento = diasVencimiento;
        this.importe = importe;
        this.moneda = moneda;
        this.color = color;
    }

    public String getFianza() {
        return this.fianza;
    }

    public void setFianza(String fianza) {
        this.fianza = fianza;
    }

    public String getMovimiento() {
        return this.movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getFiado() {
        return this.fiado;
    }

    public void setFiado(String fiado) {
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

    public String getMoneda() {
        return this.moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
