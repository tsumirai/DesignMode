package designMode;

public class InterpretMinus implements Expression {
    @Override
    public int interpret(InterpretContext context) {
        return context.getNum1()-context.getNum2();
    }
}
