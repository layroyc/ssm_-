package spring12duquproperties2;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class ReadProTest {
    //第一种读取  properties
    @Test
    public void test01(){
        String xml = "spring12duquproperties2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println("dataSource = " + dataSource);
        try {
            System.out.println("dataSource.getConnection() = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        String xml = "spring12duquproperties2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ComboPooledDataSource dataSource = ac.getBean("dataSource2", ComboPooledDataSource.class);
        System.out.println("dataSource2 = " + dataSource);
        try {
            System.out.println("dataSource.getConnection() = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/*第三种  读取多个*/
    @Test
    public void test03(){
        String xml = "spring12duquproperties2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ReadPropertiesBean readPropertiesBean = ac.getBean("readPropertiesBean", ReadPropertiesBean.class);
        System.out.println("readPropertiesBean = " + readPropertiesBean);
    }
}
