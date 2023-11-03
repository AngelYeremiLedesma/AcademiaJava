package com.aledesma.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> listObservers = new ArrayList<>();

    void attach(Observer o) {
        listObservers.add(o);
    }

    void detach(Observer o) {
        listObservers.remove(o);
    }

    void notificar(String task) {
        for (Observer o:listObservers)
            o.update();
    }
}
