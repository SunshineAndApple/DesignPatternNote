package sunshine.template;

public abstract class StartCar {
    //�ɱ䲿��
    abstract void openDoor();
    abstract void startCar();


    //���䲿��
    public final void someStarCar(){
        openDoor();

        startCar();

        //���䲿��
        System.out.println("����������....");

    }

}
