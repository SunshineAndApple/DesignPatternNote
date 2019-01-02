package sunshine.observer;

public class CustomerLiSiSuject implements ICustomerObserver {
    @Override
    public void update() {
        System.out.println("李四接到通知，准备先去看看...");
    }
}

