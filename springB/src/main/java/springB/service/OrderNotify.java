package springB.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springB.dao.NotifyDao;
import springB.pojo.Order;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service("orderNotify")
public class OrderNotify {
    @Autowired
    private Order order;
    @Autowired
    @Qualifier("NotifyByWeixin")
    private NotifyDao notifyDao;

    public void paySuccess() {
        notifyDao.sendMessage(order.toString());
    }
}
