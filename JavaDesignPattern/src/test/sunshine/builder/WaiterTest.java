package test.sunshine.builder; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sunshine.builder.Coffee;
import sunshine.builder.MakeCappuccinoImpl;
import sunshine.builder.MakeLatteImpl;
import sunshine.builder.Waiter;

/** 
* Waiter Tester. 
* 
* @author <Authors name> 
* @since <pre>Ê®¶þÔÂ 27, 2018</pre> 
* @version 1.0 
*/ 
public class WaiterTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: createCoffeeByDirector(IMakeCoffee imc) 
* 
*/ 
@Test
public void testCreateCoffeeByDirector() throws Exception { 
//TODO: Test goes here...
    Waiter waiter = new Waiter();
    //Latte
    Coffee coffeeL = waiter.createCoffeeByDirector(new MakeLatteImpl());
    System.out.println(coffeeL);

    //Cappuccino
    Coffee coffeeC = waiter.createCoffeeByDirector(new MakeCappuccinoImpl());
    System.out.println(coffeeC);
} 


} 
