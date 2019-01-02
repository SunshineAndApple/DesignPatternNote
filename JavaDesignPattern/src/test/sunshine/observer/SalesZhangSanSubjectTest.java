package test.sunshine.observer; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sunshine.observer.CustomerLiSiSuject;
import sunshine.observer.CustomerWangWuSubject;
import sunshine.observer.ISalesOfficeSubject;
import sunshine.observer.SalesZhangSanSubject;

/** 
* SalesZhangSanSubject Tester. 
* 
* @author <Authors name> 
* @since <pre>Ò»ÔÂ 2, 2019</pre> 
* @version 1.0 
*/ 
public class SalesZhangSanSubjectTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addCustomer(ICustomerObserver obj) 
* 
*/ 
@Test
public void testAddCustomer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: removeCustomer(ICustomerObserver obj) 
* 
*/ 
@Test
public void testRemoveCustomer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: notifyCustomer() 
* 
*/ 
@Test
public void testNotifyCustomer() throws Exception { 
//TODO: Test goes here...
    SalesZhangSanSubject salesZhangSanSubject = new SalesZhangSanSubject();

    salesZhangSanSubject.addCustomer(new CustomerWangWuSubject());
    salesZhangSanSubject.addCustomer(new CustomerLiSiSuject());

    salesZhangSanSubject.notifyCustomer();
} 


} 
