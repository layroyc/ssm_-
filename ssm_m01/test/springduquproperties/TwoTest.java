package springduquproperties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwoTest {
    @Test
    public  void test01(){
        String xml = "springduquproperties/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        TwoBean twoBean = ac.getBean("twoBean", TwoBean.class);
        System.out.println("twoBean = " + twoBean);
    }
}
