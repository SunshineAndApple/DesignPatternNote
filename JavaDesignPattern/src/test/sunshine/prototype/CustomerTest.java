package test.sunshine.prototype; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sunshine.prototype.Customer;

/** 
* Customer Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 25, 2018</pre> 
* @version 1.0 
*/ 
public class CustomerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setName(String name) 
* 
*/ 
@Test
public void testSetName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAge() 
* 
*/ 
@Test
public void testGetAge() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setAge(short age) 
* 
*/ 
@Test
public void testSetAge() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getCustomerPic() 
* 
*/ 
@Test
public void testGetCustomerPic() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setCustomerPic(CustomerPic customerPic) 
* 
*/ 
@Test
public void testSetCustomerPic() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: clone() 
* 
*/ 
@Test
public void testClone() throws Exception {


    System.out.println("ǳ������ ");
    Customer c1 = new Customer();
    c1.setName("����");
    c1.setAge(25);
    c1.getCustomerPic().setPicName("һ����Ƭ");

    Customer c2 = c1.clone();
    c2.setName("����");

    System.out.println(c1);
    System.out.println(c2);
    System.out.println("compare:");
    System.out.println("�Ƿ���һ������ " + c1.equals(c2));
    System.out.println("�Ƿ���һ����Ƭ�� " + c1.getCustomerPic().equals(c2.getCustomerPic()));

    //--------------------------------------------------------------------------------------------

    System.out.println("����� ");
    Customer c3 = new Customer();
    c3.setName("����");
    c3.setAge(25);
    c3.getCustomerPic().setPicName("һ����Ƭ");

    Customer c4 = c3.deepClone();
    c4.setName("����");

    System.out.println(c3);
    System.out.println(c4);
    System.out.println("compare:");
    System.out.println("�Ƿ���һ������ " + c3.equals(c4));
    System.out.println("�Ƿ���һ����Ƭ�� " + c3.getCustomerPic().equals(c4.getCustomerPic()));
} 


} 
