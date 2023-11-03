package com.aledesma.observer;

import java.util.Locale;

public class Student extends Observer{

    public String username;

    public Student(String username, Subject sb){
        super(sb);
        this.username = username;
    }

    void taskReceived(){
        System.out.println(username.toUpperCase(Locale.ROOT) + ": Thank you "+ ((Teacher)super.subject).name + ", I'm aware of the task "); //Avisa que ya lo recibió
    }

    @Override
    void update() {
        taskReceived();
    }
}
