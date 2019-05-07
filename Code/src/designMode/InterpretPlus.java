package designMode;

public class InterpretPlus implements Expression {
    @Override
    public int interpret(InterpretContext context) {
        return context.getNum1()+context.getNum2();
    }
}
