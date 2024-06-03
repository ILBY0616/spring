package springA.dao.impl;

import springA.dao.NoticeDao;

public class NoticeDaoByQQImpl implements NoticeDao {
    @Override
    public void sendMessage(String message) {
        System.out.println("发送QQ消息：" + message);
    }
}
