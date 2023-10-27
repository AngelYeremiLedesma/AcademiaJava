package com.aledesma.polimorfismo;

public class Customer extends User{

    @Override
    public void doingMyActivity(){
        System.out.println("Looking for something to buy");
    }

}
