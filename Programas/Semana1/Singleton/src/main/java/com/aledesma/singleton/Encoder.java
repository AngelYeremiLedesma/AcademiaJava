package com.aledesma.singleton;

public class Encoder {

    private String name;
    private static Encoder encoder;
    private static int counter; //Variable de clase para contar los objetos creados

    private Encoder(String name){
        this.name = name;
        counter++; //Postincremento para contar cuantas veces se ingresa a este constructor
    }

    public static Encoder getInstance(){

        if(encoder == null){
            encoder = new Encoder("BCryptEncoder");
        }

        return encoder;
    }

    public static Encoder getEncoder(){  //Para obtener el encoder haya o no haya sido incializado
        return encoder;
    }
    public static int getCounter(){
        return counter;
    }
}
