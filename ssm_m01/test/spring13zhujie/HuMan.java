package spring13zhujie;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component //这个注解就相当于写了个bean标签
//@Component 叫做 通用注解
//@Controller   等于@Component
//@Service   等于@Component  用在service层
//@Repository  等于@Component  用在dao层，但是  一般不用，因为dao层有xml映射
                //@Component @Controller @Service @Repository 四个简称  四大注解
//@Component("ren")   //可以起别名
@Component   //不起别名 是类名的首字母小写
@Scope("prototype") //加这个 就是 原型/多例  <bean class="spring13zhujie.HuMan" scope="prototype"></bean>
@Lazy //加这个  就是懒加载<bean class="spring13zhujie.HuMan" scope="prototype" lazy-init="true"></bean>

public class HuMan {
    public HuMan(){
        System.out.println("HuMan诞生了");
    };

    @PostConstruct
    /*构造器之前的方法，意思是 生命周期
    * <bean class="spring13zhujie.HuMan" scope="prototype" init-method="initShow" destroy-method="destroyObj"></bean>
    * */
    public void initShow(){
        System.out.println("初始化");
    }

    @PreDestroy //<bean class="spring13zhujie.HuMan" scope="prototype" init-method="initShow" destroy-method="destroyObj"></bean>
    public void destroyObj(){
        System.out.println("死前遗嘱");
    }
}
