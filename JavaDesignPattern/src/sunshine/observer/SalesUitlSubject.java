package sunshine.observer;

import java.util.Observable;

public class SalesUitlSubject extends Observable {
    private int num = 5;

    public void notifyCustomer(){
        System.out.println("�з�Դ����ʼ֪ͨ�ͻ�...");

        for (int i = 0; i < 8; i++) {
            if (i <= num){
                this.setChanged();
                System.out.println("�Ѿ�֪ͨ���û�, ���ǵ�" + i + "�׷���");
                this.notifyObservers("С����Ϣ*****");
            }
            System.out.println("û�з�Դ�ˣ���֪ͨ");
        }

    }
}
