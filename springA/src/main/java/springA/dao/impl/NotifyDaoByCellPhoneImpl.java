package springA.dao.impl;

import springA.dao.NotifyDao;

public class NotifyDaoByCellPhoneImpl implements NotifyDao {
    @Override
    public void sendMessage(String message) {
        System.out.println("发送手机短信：" + message);
    }
}
