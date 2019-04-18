package designMode;

public class ProxySource implements ProxySourceable{
    @Override
    public void method(){
        System.out.println("the origin method");
    }
}
