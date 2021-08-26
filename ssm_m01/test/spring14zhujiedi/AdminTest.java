package spring14zhujiedi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
    @Test
    public void test01(){
        String xml ="spring14zhujiedi/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        AdminController adminController = ac.getBean("adminController", AdminController.class);
        System.out.println("adminController = " + adminController);
        adminController.selectAll();
    }
}
