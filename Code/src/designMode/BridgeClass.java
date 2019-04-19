package designMode;

public class BridgeClass {
    private BridgeSourceable source;

    public void method() {
        source.method();
    }

    public BridgeSourceable getSource() {
        return source;
    }

    public void setSource(BridgeSourceable source){
        this.source = source;
    }
}
