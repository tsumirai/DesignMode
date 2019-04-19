package designMode;

public class MyBridgeClass extends BridgeClass{
    public void method() {
        getSource().method();
    }
}
