package ar.edu.utn.dds.observer2;

public class ConcreteObserver implements Observer {

    public void update(Observable observable) {
        // si estoy seguro del tipo de Observable, puedo hacer esto
        ConcreteObservable concreteObservable = (ConcreteObservable) observable;
        System.out.println("El nuevo valor es: " + concreteObservable.getValue());
    }

}
