package com.aledesma.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> listObservers = new ArrayList<>();

    //Metodo para suscribir observadores a este sujeto
    void attach(Observer o) {
        listObservers.add(o);
    }

    //Metodo para desuscribir observadores a este sujeto
    void detach(Observer o) {
        listObservers.remove(o);
    }

    void notificar(String task) {
        for (Observer o:listObservers)
            o.update();
    }
}
