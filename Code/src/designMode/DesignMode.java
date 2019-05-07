package designMode;

public class DesignMode {
	public static void main(String []args) {
		//¼ÆËã9+2-8µÄÖµ
		int result = new InterpretMinus().interpret(new InterpretContext(new InterpretPlus().interpret(new InterpretContext(9,2)),8));
		System.out.println(result);
	}
}
