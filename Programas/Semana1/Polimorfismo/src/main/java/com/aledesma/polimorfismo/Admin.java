package com.aledesma.polimorfismo;

public class Admin extends User{
    @Override
    public void doingMyActivity() {
        System.out.println("Managing businesses");
    }
}
