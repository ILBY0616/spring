package springB.dao.impl;

import org.springframework.stereotype.Repository;
import springB.dao.NotifyDao;

@Repository("NotifyByCellPhone")
public class NotifyDaoByCellPhoneImpl implements NotifyDao {
    @Override
    public void sendMessage(String message) {
        System.out.println("发送手机短信：" + message);
    }
}
