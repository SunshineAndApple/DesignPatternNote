package sunshine.observer;

import sunshine.template.StartTesla;

import java.util.Observable;
import java.util.Observer;

public class CustomerUtilObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String info = (String) arg;
        System.out.println("�з�Դ���˿�ȥ������ �����ṩ��С����Ϣ��" + info);

    }
}
