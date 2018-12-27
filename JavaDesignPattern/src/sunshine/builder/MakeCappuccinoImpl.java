package sunshine.builder;

public class MakeCappuccinoImpl implements IMakeCoffee {
    Coffee coffee;

    public MakeCappuccinoImpl(){
        if (null == coffee){
            coffee = new Coffee();
        }
        System.out.println("׼������һ��������ŵ...");
    }

    @Override
    public void addName() {
        coffee.setName("������ŵ����:");
    }

    @Override
    public void addMilk() {
        coffee.setMilk("����֮һ��");
    }

    @Override
    public void addCoffee() {
        coffee.setEspresso("����֮һ����");
    }

    @Override
    public void addFroth() {
        coffee.setFroth("����֮һ����");
    }

    @Override
    public Coffee createOneCoffee() {
        return coffee;
    }
}
