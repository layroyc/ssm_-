package springCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void add() {
        studentDao.insert();
    }

    @Override
    public void del() {
        studentDao.del();
    }

    @Override
    public void update() {
        studentDao.update();
    }

    @Override
    public void selectAll() {
        studentDao.selectAll();

    }
}
