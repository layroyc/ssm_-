package springCRUD;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test01(){
        String xml = "springCRUD/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        StudentController studentController = ac.getBean("studentController", StudentController.class);
        System.out.println("studentController = " + studentController);
        studentController.delete();
        studentController.update();
        studentController.insert();
        studentController.selectAll();
    }
}
