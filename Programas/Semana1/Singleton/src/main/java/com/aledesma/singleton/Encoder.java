package com.aledesma.singleton;

public class Encoder {

    private String name;
    private static Encoder encoder;

    private static int counter;

    private Encoder(String name){
        this.name = name;
        counter++;
    }

    public static Encoder getInstance(){

        if(encoder == null){
            encoder = new Encoder("BCryptEncoder");
        }

        return encoder;
    }

    public static Encoder getEncoder(){
        return encoder;
    }
    public static int getCounter(){
        return counter;
    }
}
