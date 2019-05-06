package designMode;

public class ObserverMySubject extends ObserverAbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self");
        notifyObserver();
    }
}
