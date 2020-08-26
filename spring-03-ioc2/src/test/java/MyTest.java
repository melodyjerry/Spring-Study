import com.melodyhub.pojo.User;
import com.melodyhub.pojo.UserTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","beans2.xml","beans3.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserTwo user = (UserTwo) context.getBean("u8");
        user.show();
    }
}
