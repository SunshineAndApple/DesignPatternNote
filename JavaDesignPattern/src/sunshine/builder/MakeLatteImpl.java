package sunshine.builder;

public class MakeLatteImpl implements IMakeCoffee {
    Coffee coffee;

    public MakeLatteImpl(){
        if (null == coffee){
            coffee = new Coffee();
        }

        System.out.println("׼������һ������:...");
    }

    @Override
    public void addName() {
        coffee.setName("�������ȣ�");
    }

    @Override
    public void addMilk() {
        coffee.setMilk("�����");
    }

    @Override
    public void addCoffee() {
        coffee.setEspresso("�ٷſ���");
    }

    @Override
    public void addFroth() {
        coffee.setFroth("�ٷ�����");
    }

    @Override
    public Coffee createOneCoffee() {
        return coffee;
    }


}
