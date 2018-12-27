package sunshine.builder;

public class MakeLatteImpl implements IMakeCoffee {
    Coffee coffee;

    public MakeLatteImpl(){
        if (null == coffee){
            coffee = new Coffee();
        }

        System.out.println("准备制作一杯拿铁:...");
    }

    @Override
    public void addName() {
        coffee.setName("拿铁咖啡：");
    }

    @Override
    public void addMilk() {
        coffee.setMilk("多放奶");
    }

    @Override
    public void addCoffee() {
        coffee.setEspresso("少放咖啡");
    }

    @Override
    public void addFroth() {
        coffee.setFroth("少放奶泡");
    }

    @Override
    public Coffee createOneCoffee() {
        return coffee;
    }


}
