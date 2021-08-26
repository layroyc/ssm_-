package springCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController  {
    @Autowired
    private StudentService studentService;

    public void insert(){
        studentService.add();
    }

    public void delete(){
        studentService.del();
    }

    public void update(){
        studentService.update();
    }

    public void selectAll(){
        studentService.selectAll();
    }
}
