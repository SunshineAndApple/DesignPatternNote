package sunshine.observer;

import sunshine.template.StartTesla;

import java.util.Observable;
import java.util.Observer;

public class CustomerUtilObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String info = (String) arg;
        System.out.println("有房源，顾客去看房， 销售提供的小道消息：" + info);

    }
}
