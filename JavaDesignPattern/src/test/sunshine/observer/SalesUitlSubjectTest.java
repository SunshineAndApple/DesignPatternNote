package test.sunshine.observer; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sunshine.observer.CustomerUtilObserver;
import sunshine.observer.SalesUitlSubject;

/** 
* SalesUitlSubject Tester. 
* 
* @author <Authors name> 
* @since <pre>Ò»ÔÂ 2, 2019</pre> 
* @version 1.0 
*/ 
public class SalesUitlSubjectTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: notyfyCustomer(String info) 
* 
*/ 
@Test
public void testNotyfyCustomer() throws Exception { 
//TODO: Test goes here...
    SalesUitlSubject salesUitlSubject = new SalesUitlSubject();
    salesUitlSubject.addObserver(new CustomerUtilObserver());
    salesUitlSubject.addObserver(new CustomerUtilObserver());
    salesUitlSubject.notifyCustomer();
}


} 
