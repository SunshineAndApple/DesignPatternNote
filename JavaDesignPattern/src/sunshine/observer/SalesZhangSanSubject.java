package sunshine.observer;

import java.util.ArrayList;
import java.util.List;

public class SalesZhangSanSubject implements ISalesOfficeSubject {
    /*
    订阅者列表
     */
    private List<ICustomerObserver> listCustomerObserver = new ArrayList<ICustomerObserver>();

    @Override
    public void addCustomer(ICustomerObserver obj) {
        listCustomerObserver.add(obj);
    }

    @Override
    public void removeCustomer(ICustomerObserver obj) {
        listCustomerObserver.remove(obj);
    }

    /*
    遍历通知订阅者
     */
    @Override
    public void notifyCustomer() {
        System.out.println("销售张三知道有房子卖了...");
        for (ICustomerObserver iCustomerObserver : listCustomerObserver) {
            iCustomerObserver.update();
        }
    }
}
