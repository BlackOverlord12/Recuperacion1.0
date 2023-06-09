package com.example.recuperacion1;

public class Cotizacion {
    private int folio;
    private String descripcion;
    private float valorAuto;
    private float porEnganche;
    private int plazo;

    public Cotizacion(int folio, String descripcion, float valorAuto, float porEnganche, int plazo) {
        this.folio = folio;
        this.descripcion = descripcion;
        this.valorAuto = valorAuto;
        this.porEnganche = porEnganche;
        this.plazo = plazo;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(float valorAuto) {
        this.valorAuto = valorAuto;
    }

    public float getPorEnganche() {
        return porEnganche;
    }

    public void setPorEnganche(float porEnganche) {
        this.porEnganche = porEnganche;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public float calcularPagoInicial() {
        return valorAuto * (porEnganche / 100);
    }

    public float calcularPagoMensual() {
        float montoFinanciado = valorAuto - calcularPagoInicial();
        return montoFinanciado / plazo;
    }
}
