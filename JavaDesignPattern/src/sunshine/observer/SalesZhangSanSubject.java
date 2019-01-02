package sunshine.observer;

import java.util.ArrayList;
import java.util.List;

public class SalesZhangSanSubject implements ISalesOfficeSubject {
    /*
    �������б�
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
    ����֪ͨ������
     */
    @Override
    public void notifyCustomer() {
        System.out.println("��������֪���з�������...");
        for (ICustomerObserver iCustomerObserver : listCustomerObserver) {
            iCustomerObserver.update();
        }
    }
}
