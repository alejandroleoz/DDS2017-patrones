package ar.edu.utn.dds.observer2;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void observerTest() {

        Observer observer = new ConcreteObserver();
        ConcreteObservable observable = new ConcreteObservable();

        // agrego el observer
        observable.addObserver(observer);

        // ahora cambio el valor en el observable y se notificara a los Observers
        observable.setValue("Hola a todos");

        // y un nuevo cambio y notificacion
        observable.setValue("Chau chau chau chauuu");

    }
}
