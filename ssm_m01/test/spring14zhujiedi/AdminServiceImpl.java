package spring14zhujiedi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
   // @Resource  //相当于我们的xml的注入   byType
    @Autowired  //注解2：spring提供的  多用这个，spring体系  byNmae
    private AdminDao adminDao;
    @Override
    public void selectAll() {
        //service层 调用dao层，service层依赖了dao
        adminDao.selectAll();

    }
}
