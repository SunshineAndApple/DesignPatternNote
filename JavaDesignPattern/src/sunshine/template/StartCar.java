package sunshine.template;

public abstract class StartCar {
    //可变部分
    abstract void openDoor();
    abstract void startCar();


    //不变部分
    public final void someStarCar(){
        openDoor();

        startCar();

        //不变部分
        System.out.println("汽车发动了....");

    }

}
