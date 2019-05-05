package designMode;

public class StrategyPlus extends StrategyAbstractCalculator implements StrategyICalculator {
    @Override
    public int calculator(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
