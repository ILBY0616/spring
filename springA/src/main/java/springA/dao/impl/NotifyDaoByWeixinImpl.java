package springA.dao.impl;

import springA.dao.NotifyDao;

public class NotifyDaoByWeixinImpl implements NotifyDao {
    @Override
    public void sendMessage(String message) {
        System.out.println("发送微信短信：" + message);
    }
}
