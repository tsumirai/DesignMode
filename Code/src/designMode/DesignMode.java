package designMode;

public class DesignMode {
	public static void main(String []args) {
		//����9+2-8��ֵ
		int result = new InterpretMinus().interpret(new InterpretContext(new InterpretPlus().interpret(new InterpretContext(9,2)),8));
		System.out.println(result);
	}
}
