package sunshine.template;

public class StartOldCar extends StartCar {
    @Override
    void openDoor() {
        System.out.println("��Կ�״���ʽ��������");
    }

    @Override
    void startCar() {
        System.out.println("��Կ�׷�����ʽ����");
    }
}
