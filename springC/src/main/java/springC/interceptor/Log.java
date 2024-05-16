package springC.interceptor;

import lombok.Setter;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import springC.pojo.User;

import java.util.Date;

@Setter
public class Log implements MethodInterceptor {
    private User user;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //执行目标方法
        Object object = invocation.proceed();

        //打印日志记录
        String name = user.getName();
        Date date = new Date();
        String method = invocation.getMethod().getName();
        System.out.println("日志记录:");
        System.out.println("用户：" + name);
        System.out.println("时间：" + date);
        System.out.println("操作：" + method);
        return object;
    }
}
