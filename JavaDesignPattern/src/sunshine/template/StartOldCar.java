package sunshine.template;

public class StartOldCar extends StartCar {
    @Override
    void openDoor() {
        System.out.println("用钥匙打开老式汽车车门");
    }

    @Override
    void startCar() {
        System.out.println("用钥匙发动老式汽车");
    }
}
