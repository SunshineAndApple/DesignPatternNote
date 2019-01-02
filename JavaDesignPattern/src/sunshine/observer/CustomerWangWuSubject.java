package sunshine.observer;

public class CustomerWangWuSubject implements ICustomerObserver {
    @Override
    public void update() {
        System.out.println("王五接到通知，直接去买房....");
    }
}
