package springA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springA.service.OrderNotify;
public class AppA {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderNotify orderNotify1 = context.getBean("orderNotify1", OrderNotify.class);
        orderNotify1.paySuccess();
        OrderNotify orderNotify2 = context.getBean("orderNotify2", OrderNotify.class);
        orderNotify2.paySuccess();
        System.out.println("以上输出结果由：软工21101班，202114060108号 邱鹏完成");
    }
}