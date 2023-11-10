package com.aledesma.di;

public class HierbasEspecias implements Planta{
    @Override
    public void cultivar() {
        System.out.println("Cultivando hierbas especiales");

    }

    @Override
    public void cosechar() {
        System.out.println("Cosechando hierbas especiales");
    }
}
