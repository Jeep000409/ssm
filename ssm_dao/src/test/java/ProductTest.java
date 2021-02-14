import com.dao.LogDao;
import com.dao.PermissionDao;
import com.dao.ProductDao;
import com.dao.UserDao;
import com.domain.Log;
import com.domain.Permission;
import com.domain.Product;
import com.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
public class ProductTest {
   @Autowired
    ProductDao productDao;
   @Autowired
    UserDao userDao;
   @Autowired
    PermissionDao permissionDao;
   @Autowired
    LogDao logDao;

    @Test
    public void test1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring/*.xml");
        ProductDao bean=ac.getBean(ProductDao.class);
        System.out.println(bean);
    }
    @Test
    public void test2(){
        List<Product> ist=this.productDao.findProductAll();
        System.out.println(ist);
    }
    @Test
    public void test3(){
        List<SysUser> list=this.userDao.findUserAll();
        System.out.println(list);
    }
    @Test
    public void test4(){
        List<Permission> list=this.permissionDao.findPermissionAll();
        System.out.println(list);
    }
    @Test
    public void test5(){
        Log log=new Log();
        log.setUsername("ks4");
        log.setVisitTime("2021-01-12 21:54:48");
        log .setIp("11");
        log.setMethod("22");
        logDao.insertLog(log);
        System.out.println("11" );
    }
}
