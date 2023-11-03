package com.aledesma.observer;

import java.util.Locale;

public class Teacher extends Subject{

    public String name;

    public Teacher(String name){
        this.name = name;
    }
    void assignTask(String task){
        System.out.println(name.toUpperCase(Locale.ROOT) + " ASSIGNED A NEW TASK: " + task);
        notificar(task);
    }
}
