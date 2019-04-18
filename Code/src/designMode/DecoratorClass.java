package designMode;

public class DecoratorClass implements DecoratorSouceable {
    private DecoratorSouceable source;

    public DecoratorClass(DecoratorSouceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        source.method();
        System.out.println("after decorator");
    }
}
