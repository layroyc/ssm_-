package spring15zhujiechangyongzhuru;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
* 注解版的常用类型注入
* */
@Component
public class Teacher3 {
    @Value("roys")
    private String name;
    @Value("20")
    private int age;
    @Value("#{friendName}")
    //余下的就是集合，需要读取xml注入
    private List<String> friendName;
    @Value("#{loveName}")
    private Set<String> loveName;
    @Value("#{score}")
    private Map<String, Double> score;
    @Value("#{properties}")
    private Properties properties;
    @Value("#{url.name}")
    private String url;

    @Override
    public String toString() {
        return "Teacher3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendName=" + friendName +
                ", loveName=" + loveName +
                ", score=" + score +
                ", properties=" + properties +
                ", url='" + url + '\'' +
                '}';
    }
}
