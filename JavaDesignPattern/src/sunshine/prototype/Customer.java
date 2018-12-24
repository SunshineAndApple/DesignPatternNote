package sunshine.prototype;

public class Customer implements Cloneable {
    /*
    成员变量
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public CustomerPic getCustomerPic() {
        return customerPic;
    }

    public void setCustomerPic(CustomerPic customerPic) {
        this.customerPic = customerPic;
    }

    private String name;
    private short age;
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
        浅拷贝
         */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try{
            obj = super.clone();
            return (Customer)obj;
        }
        catch (CloneNotSupportedException e){
            System.out.println("clone error!");
        }
    }
}
