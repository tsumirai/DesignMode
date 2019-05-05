package designMode;

public class StrategyMinus extends StrategyAbstractCalculator implements StrategyICalculator {
    @Override
    public int calculator(String exp){
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]- arrayInt[1];
    }
}
