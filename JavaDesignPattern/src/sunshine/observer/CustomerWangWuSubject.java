package sunshine.observer;

public class CustomerWangWuSubject implements ICustomerObserver {
    @Override
    public void update() {
        System.out.println("����ӵ�֪ͨ��ֱ��ȥ��....");
    }
}
