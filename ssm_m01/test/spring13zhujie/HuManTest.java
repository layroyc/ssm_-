package spring13zhujie;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HuManTest {
    @Test
    public void test01(){
        String xml = "spring13zhujie/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        HuMan ren = ac.getBean("huMan", HuMan.class);
        System.out.println("ren = " + ren);

    }
}
