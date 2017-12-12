package ar.edu.utn.dds.observer2;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable implements Observable {

    // Collection de observers
    private Set<Observer> observers;

    // Valor que será notificado al cambiar
    private String value;

    public ConcreteObservable() {
        this.observers = new HashSet();
    }

    // agrega un observer a la collection
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    // notifica a todos los observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;

        // cambio el valor y notifico
        this.notifyObservers();
    }
}
