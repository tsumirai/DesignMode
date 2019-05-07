package designMode;

public class MediatorUser1 extends MediatorUser {
    public MediatorUser1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe");
    }
}
