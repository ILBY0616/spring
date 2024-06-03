package springB;

import org.springframework.stereotype.Repository;

@Repository("Notice")
public class Notice {

    public void sendMessage(String message) {
        System.out.println("发送消息：" + message);
    }
}
