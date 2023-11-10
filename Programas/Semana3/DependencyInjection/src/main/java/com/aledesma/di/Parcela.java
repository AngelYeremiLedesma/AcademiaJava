package com.aledesma.di;

public class Parcela {

    private String seccion;
    private int numero;

    private Planta tipoPlanta;

    public Parcela(String seccion, int numero) {
        this.seccion = seccion;
        this.numero = numero;
    }

    public void cultivarParcela(){
        System.out.println("Cultivo de parcela " + seccion + numero + " en curso");
        tipoPlanta.cultivar();
    }

    public void cosecharParcela(){
        System.out.println("Cosecha de parcela " + seccion + numero + " en curso");
        tipoPlanta.cosechar();
    }

    public void setTipoPlanta(Planta tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }
}
