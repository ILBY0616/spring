package springC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springC.service.UserService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SpringC {
    public static void main(String[] args) throws UnknownHostException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要执行的操作：1.查询 2.修改 3.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    userService.query();
                    break;
                case 2:
                    userService.upgrade();
                    break;
                default:
                    return;
            }
            System.out.println("以上输出结果由：软工21101班，202114060108号 邱鹏完成");
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("主机名称：" + inetAddress.getHostName());
            System.out.println("主机地址：" + inetAddress.getHostAddress());
        }
    }
}
