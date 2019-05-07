package designMode;

public class MyMediator implements Mediator {
    private MediatorUser user1;
    private MediatorUser user2;

    public MediatorUser getUser1() {
        return user1;
    }

    public MediatorUser getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new MediatorUser1(this);
        user2 = new MediatorUser2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
