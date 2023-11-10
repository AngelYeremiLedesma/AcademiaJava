package com.aledesma.di;

public class Frutas implements Planta{
    @Override
    public void cultivar() {
        System.out.println("Cultivando frutas");

    }

    @Override
    public void cosechar() {
        System.out.println("Cosechando frutas");
    }
}
