package springB;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Setter
@NoArgsConstructor
@Service("OrderNotice")
public class OrderNotice {
    private Order order;
    private Notice notice;

    @Autowired
    public OrderNotice(@Qualifier("Order") Order order, @Qualifier("Notice") Notice notice) {
        this.order = order;
        this.notice = notice;
    }

    public void sendNotice() {
        notice.sendMessage(order.toString());
    }
}
