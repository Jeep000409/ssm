//import com.domain.Log;
//import com.domain.Product;
//import com.service.LogService;
//import com.service.ProductService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:spring/*.xml"})
//public class TestPageHelper {
//    @Autowired
//    ProductService productService;
//    @Autowired
//    LogService logService;
//
//    @Test
//    public void test1(){
//
//        productService.testPageHelper(4,3);
//    }
//    @Test
//    public void test2(){
//        List<Log> logList=logService.findLogAll();
//        System.out.println(logList);
//    }
//    @Test
//    public void test3(){
//      List<Product> productList =productService.findAll();
//        System.out.println(productList);
//    }
//}
