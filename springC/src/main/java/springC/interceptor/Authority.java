package springC.interceptor;

import lombok.Setter;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import springC.pojo.User;

@Setter
public class Authority implements MethodInterceptor {
    private User user;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("权限验证开始");
        String name = this.user.getName();
        String method = invocation.getMethod().getName();
        Object object = null;
        switch (name) {
            case "admin":
                object = invocation.proceed();
                System.out.println("拥有任何权限");
                break;
            case "register":
                if (method.equals("find")) {
                    object = invocation.proceed();
                } else {
                    System.out.println("没有修改权限");
                }
                break;
            default:
                System.out.println("没有任何权限");
                break;
        }
        System.out.println("权限验证结束");
        return object;
    }
}
