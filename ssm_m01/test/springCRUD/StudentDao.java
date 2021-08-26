package springCRUD;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    //增
    public void insert(){
        System.out.println("我是dao层,我是负责添加数据");
    }
    //删
    public void del(){
        System.out.println("我是dao层,我是负责删除数据");
    }
    //改
    public void update(){
        System.out.println("我是dao层,我是负责修改数据");
    }
    //查
    public void selectAll(){
        System.out.println("我是dao层,我是负责数据的全查");
    }
}
