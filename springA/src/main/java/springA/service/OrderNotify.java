package springA.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springA.dao.NotifyDao;
import springA.pojo.Order;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderNotify {
    private Order order;
    private NotifyDao notifyDao;

    public void paySuccess() {
        notifyDao.sendMessage(order.toString());
    }
}
