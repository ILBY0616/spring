package springB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springB.service.OrderNotify;

public class SpringB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderNotify orderNotify3 = context.getBean("orderNotify", OrderNotify.class);
        orderNotify3.paySuccess();
        System.out.println("以上输出结果由：软工21101班，202114060108号 邱鹏完成");
    }
}
