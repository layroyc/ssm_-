package spring14zhujiedi;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;//接口的调用
    //查询全部的方法
    public void selectAll(){
        //controller 层调用 service层-------即：   controller 层 依赖了service层
        adminService.selectAll();
    }
}
