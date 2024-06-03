package springA.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springA.dao.NoticeDao;
import springA.pojo.Order;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderNotice {
    private Order order;
    private NoticeDao noticeDao;

    public void sendNotice() {
        noticeDao.sendMessage(order.toString());
    }
}
