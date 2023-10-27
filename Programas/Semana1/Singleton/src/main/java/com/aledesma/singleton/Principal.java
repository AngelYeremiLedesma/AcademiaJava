package com.aledesma.singleton;

public class Principal {
    public static void main(String[] args) {
        //Declarando 6 variables que deberían apuntar al mismo objeto
        Encoder encoder1 = Encoder.getInstance();
        Encoder encoder2 = Encoder.getInstance();
        Encoder encoder3 = Encoder.getInstance();
        Encoder encoder4 = Encoder.getInstance();
        Encoder encoder5 = Encoder.getInstance();
        Encoder encoder6 = Encoder.getInstance();

        System.out.println("Objetos creados: " + Encoder.getCounter()); //Contador proporcionado por la Clase

        if((encoder1==encoder2)&&(encoder3==encoder4)&&(encoder5==encoder6)&&(encoder2==encoder3)&&(encoder4==encoder5)){ // Verificando que todas esas variables de referencia apuntan al mismo objeto
            System.out.println("Todos hacen referencia al mismo objeto: " + Encoder.getEncoder()); //Imprimiendo el unico Encoder instanciado
        }

    }
}
