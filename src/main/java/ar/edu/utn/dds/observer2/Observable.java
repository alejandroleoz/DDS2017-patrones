package ar.edu.utn.dds.observer2;

public interface Observable {

    public void addObserver(Observer observer);

    public void notifyObservers();

}
