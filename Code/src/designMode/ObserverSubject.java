package designMode;

public interface ObserverSubject {
    //增加观察者
    void add(Observer observer);

    //删除观察者
    void del(Observer observer);

    //通知所有观察者
    void notifyObserver();

    //自身操作
    void operation();
}
