package designMode;

public abstract class MediatorUser {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public MediatorUser(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
