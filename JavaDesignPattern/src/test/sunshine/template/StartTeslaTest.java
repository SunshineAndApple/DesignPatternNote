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
* @since <pre>ʮ���� 25, 2018</pre> 
* @version 1.0 
*/ 
public class StartTeslaTest { 

@Before
public void before() throws Exception {
    System.out.println("����Ҫ����һ����ʽ������");
    StartOldCar soc = new StartOldCar();
    soc.someStarCar();

    System.out.println("����Ҫ����һ����˹����");
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
