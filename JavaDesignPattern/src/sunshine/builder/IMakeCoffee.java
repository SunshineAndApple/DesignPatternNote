package sunshine.builder;
/*
IBuilder
 */
public interface IMakeCoffee {
    void addName();
    void addMilk();
    void addCoffee();
    void addFroth();
    Coffee createOneCoffee();

}
