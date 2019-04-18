package designMode;

public class DesignMode {
	public static void main(String []args) {
		DecoratorSouceable source = new DecoratorSource();
		DecoratorSouceable obj = new DecoratorClass(source);
		obj.method();
	}
}
