package test.sunshine.template; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import sunshine.template.StartOldCar;
import sunshine.template.StartTesla;

/** 
* StartTesla Tester. 
* 
* @author <Authors name> 
* @since <pre>十二月 25, 2018</pre> 
* @version 1.0 
*/ 
public class StartTeslaTest { 

@Before
public void before() throws Exception {
    System.out.println("我们要发动一个老式汽车：");
    StartOldCar soc = new StartOldCar();
    soc.someStarCar();

    System.out.println("我们要发动一个特斯拉：");
    StartTesla st = new StartTesla();
    st.someStarCar();
} 

@After
public void after() throws Exception { 
} 

@Test
public void test()
{

}


} 
