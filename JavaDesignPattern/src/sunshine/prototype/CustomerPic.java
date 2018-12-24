package sunshine.prototype;

import java.io.Serializable;

public class CustomerPic implements Serializable {
    public String picName;

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }
}
