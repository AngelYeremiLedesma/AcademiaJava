package com.aledesma.singleton;

public class Principal {
    public static void main(String[] args) {

        Encoder encoder1 = Encoder.getInstance();
        Encoder encoder2 = Encoder.getInstance();
        Encoder encoder3 = Encoder.getInstance();
        Encoder encoder4 = Encoder.getInstance();
        Encoder encoder5 = Encoder.getInstance();
        Encoder encoder6 = Encoder.getInstance();

        System.out.println("Objetos creados: " + Encoder.getCounter());

        if((encoder1==encoder2)&&(encoder3==encoder4)&&(encoder5==encoder6)){
            System.out.println("Todos hacen referencia al mismo objeto: " + Encoder.getEncoder());
        }

    }
}
