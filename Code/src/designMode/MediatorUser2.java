package designMode;

public class MediatorUser2 extends MediatorUser {
    public MediatorUser2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe");
    }
}
