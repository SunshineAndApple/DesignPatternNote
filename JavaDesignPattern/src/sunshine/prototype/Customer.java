package sunshine.prototype;

import java.io.*;

/*
原型模式,实现一个对象的深浅拷贝
 */
public class Customer implements Cloneable, Serializable {
    /*
    成员变量
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CustomerPic getCustomerPic() {
        return customerPic;
    }

    public void setCustomerPic(CustomerPic customerPic) {
        this.customerPic = customerPic;
    }

    private String name;
    private int age;
    private CustomerPic customerPic;

    /*
    构造中创建成员对象类
    */
    public Customer(){
        if (customerPic == null){
            customerPic = new CustomerPic();
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", customerPic=" + customerPic.getPicName() +
                '}';
    }

    /*
        浅拷贝:要继承Cloneable接口
   */
   public Customer clone() throws CloneNotSupportedException {
        Object obj = null;
        try{
            obj = super.clone();

        }
        catch (CloneNotSupportedException e){
            System.out.println("clone error!");
        }
        return (Customer)obj;
    }

    /*
        深拷贝：要继承Serializable接口
   */
    public Customer deepClone() throws CloneNotSupportedException {
        //write obj to byte
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bao);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read obj from byte
        Customer deepCustomer = null;
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(bai);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            deepCustomer =  (Customer)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return deepCustomer;
    }
}
