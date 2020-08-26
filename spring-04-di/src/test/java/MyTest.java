import com.melodyhub.pojo.Student;
import com.melodyhub.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
        Student{
            name='MelodyJerry',
            address=Address{
                address='null'
            },
            books=[西游记, 三国演义, 红楼梦, 水浒传],
            hobbys=[听歌, 打球, 跑步, 学习],
            card={
                身份证=1234567890,
                银行卡=2364101
            },
            games=[王者荣耀, LOL],
            wife='null',
            info={
                年龄=21,
                身高=186cm,
                性别=男
            }
        }
        */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user",User.class);
        User user2 = context.getBean("user2",User.class);
        System.out.println(user);
        System.out.println(user2);
    }
}
