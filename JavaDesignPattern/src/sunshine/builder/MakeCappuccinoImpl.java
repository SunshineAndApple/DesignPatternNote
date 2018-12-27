package sunshine.builder;

public class MakeCappuccinoImpl implements IMakeCoffee {
    Coffee coffee;

    public MakeCappuccinoImpl(){
        if (null == coffee){
            coffee = new Coffee();
        }
        System.out.println("准备制作一杯卡布奇诺...");
    }

    @Override
    public void addName() {
        coffee.setName("卡布奇诺咖啡:");
    }

    @Override
    public void addMilk() {
        coffee.setMilk("三分之一奶");
    }

    @Override
    public void addCoffee() {
        coffee.setEspresso("三分之一咖啡");
    }

    @Override
    public void addFroth() {
        coffee.setFroth("三分之一奶泡");
    }

    @Override
    public Coffee createOneCoffee() {
        return coffee;
    }
}
