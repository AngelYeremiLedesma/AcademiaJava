package com.aledesma.di;

public class Cereales implements Planta{
    @Override
    public void cultivar() {
        System.out.println("Cultivando cereal");
    }

    @Override
    public void cosechar() {
        System.out.println("Cosechando cereal");
    }
}
