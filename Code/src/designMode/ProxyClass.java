package designMode;

public class ProxyClass implements ProxySourceable {
    private ProxySource source;
    public ProxyClass(){
        super();
        this.source = new ProxySource();
    }

    @Override
    public void method(){
        before();
        source.method();
        after();
    }

    private void before() {
        System.out.println("before proxy");
    }

    private void after() {
        System.out.println("after proxy");
    }
}
