import com.entity.A;
import com.entity.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        A a = (A)context.getBean("a");
        B b = (B)context.getBean("b");
        a.display();
        context.close();
    }
}
