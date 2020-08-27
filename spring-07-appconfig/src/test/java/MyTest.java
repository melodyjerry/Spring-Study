import com.melodyhub.config.appconfig;
import com.melodyhub.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做,我们就只能通过 Annotationconfig 上下文来获取容器,通过配置类的class对象加载!
        ApplicationContext context = new AnnotationConfigApplicationContext(appconfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
