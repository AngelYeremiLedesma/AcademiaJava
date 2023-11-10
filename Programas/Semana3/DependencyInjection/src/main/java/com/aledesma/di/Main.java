package com.aledesma.di;

public class Main {
    public static void main(String[] args) {

        Parcela parcelaA1 = new Parcela("A",1);
        Injector.inyectarParcela(parcelaA1,"Cereales");//se asigna el tipo de planta de la parcela
        parcelaA1.cultivarParcela();

        System.out.println("");

        Parcela parcelaB2 = new Parcela("B",2);
        Injector.inyectarParcela(parcelaB2,"Frutas");//se asigna el tipo de planta de la parcela
        parcelaB2.cultivarParcela();

        System.out.println("");

        Parcela parcelaC51 = new Parcela("C",51);
        Injector.inyectarParcela(parcelaC51,"HierbasEspeciales");//se asigna el tipo de planta de la parcela
        parcelaB2.cultivarParcela();

        System.out.println("");

        System.out.println("*********  Pasan los meses *********");

        System.out.println("");

        parcelaA1.cosecharParcela();
        Injector.inyectarParcela(parcelaA1,"");//se elimina el tipo de planta de la parcela

        System.out.println("");

        parcelaB2.cosecharParcela();
        Injector.inyectarParcela(parcelaB2,"");//se elimina el tipo de planta de la parcela

        System.out.println("");

        parcelaC51.cosecharParcela();
        Injector.inyectarParcela(parcelaC51,"");//se elimina el tipo de planta de la parcela
    }
}
