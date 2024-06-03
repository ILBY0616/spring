package springA.dao.impl;

import springA.dao.NoticeDao;

public class NoticeDaoByWeChatImpl implements NoticeDao {
    @Override
    public void sendMessage(String message) {
        System.out.println("发送WeChat消息：" + message);
    }
}
