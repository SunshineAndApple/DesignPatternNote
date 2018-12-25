package sunshine.template;

public class StartTesla extends StartCar {
    @Override
    void openDoor() {
        System.out.println("特斯拉感应到车钥匙自动开门了");
    }

    @Override
    void startCar() {
        System.out.println("按下特斯拉启动按钮");
    }
}
