import com.test.pojo.Items;
import com.test.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ServiceTest {


    @Test
    public void test01() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsServiceImpl");
        List<Items> itemsList = itemsService.findAll();
        System.out.println(itemsList);
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试测试");
        itemsService.save(items);
    }
}