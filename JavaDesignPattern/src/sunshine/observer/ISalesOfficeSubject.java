package sunshine.observer;

public interface ISalesOfficeSubject {
    void addCustomer(ICustomerObserver obj);
    void removeCustomer(ICustomerObserver obj);
    void notifyCustomer();
}
