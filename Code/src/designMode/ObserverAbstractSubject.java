package designMode;

import java.util.*;

public class ObserverAbstractSubject implements ObserverSubject {
    private Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation(){}
}
