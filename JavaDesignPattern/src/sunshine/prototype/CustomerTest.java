package sunshine.prototype;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CustomerTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Customer.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void clone() {
        Customer c1 = new Customer();
        c1.setName("张三");
        c1.setAge(25);
        c1.getCustomerPic().setPicName("一个照片");

        Customer c2 = c1.clone();
        c2.setName("李四");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("compare:");
        System.out.println(c1.equals(c2));
        System.out.println(c1.getCustomerPic().equals(c2.getCustomerPic()));


    }
}
