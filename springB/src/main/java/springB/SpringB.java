package springB;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderNotice orderNotice = context.getBean("OrderNotice", OrderNotice.class);
        orderNotice.sendNotice();
        System.out.println("以上输出结果由：软工21101班，202114060108号 邱鹏完成");
    }
}
