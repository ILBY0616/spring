package springA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import springA.service.OrderNotice;

public class SpringA {
    public static void main(String[] args) {
        ApplicationContext cpac =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext fsac =
                new FileSystemXmlApplicationContext("D:\\IDEA\\WorkPlace\\spring\\springA\\src\\main\\resources\\applicationContext.xml");

        OrderNotice noticeByQQ = cpac.getBean("noticeByQQ", OrderNotice.class);
        noticeByQQ.sendNotice();

        OrderNotice noticeByWeChat = fsac.getBean("noticeByWeChat", OrderNotice.class);
        noticeByWeChat.sendNotice();

        System.out.println("以上输出结果由：软工21101班，202114060108号 邱鹏完成");
    }
}