package sunshine.observer;

import java.util.Observable;

public class SalesUitlSubject extends Observable {
    private int num = 5;

    public void notifyCustomer(){
        System.out.println("有房源，开始通知客户...");

        for (int i = 0; i < 8; i++) {
            if (i <= num){
                this.setChanged();
                System.out.println("已经通知了用户, 这是第" + i + "套房子");
                this.notifyObservers("小道消息*****");
            }
            System.out.println("没有房源了，不通知");
        }

    }
}
