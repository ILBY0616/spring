package springB.dao.impl;

import org.springframework.stereotype.Repository;
import springB.dao.NotifyDao;

@Repository("NotifyByWeixin")
public class NotifyDaoByWeixinImpl implements NotifyDao {
    @Override
    public void sendMessage(String message) {
        System.out.println("发送微信短信：" + message);
    }
}
