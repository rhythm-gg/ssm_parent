import com.test.dao.ItemsDao;
import com.test.pojo.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) ac.getBean("itemsDao");
        List<Items> itemsList = itemsDao.findAll();
        System.out.println(itemsList);
    }
}
