package designMode;

public class DesignMode {
	public static void main(String []args) {
		String exp = "2+8";
		StrategyICalculator cal = new StrategyPlus();
		int result = cal.calculator(exp);
		System.out.println("2+8="+result);
		exp = "8-2";
		cal = new StrategyMinus();
		result = cal.calculator(exp);
		System.out.println("8-2="+result);
		exp = "8*2";
		cal = new StrategyMultiply();
		result = cal.calculator(exp);
		System.out.println("8*2="+result);
	}
}
