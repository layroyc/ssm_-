package spring14zhujiedi;

import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
    public void selectAll(){
        System.out.println("我是dao层,我是负责数据的增删改查");
    }
}
