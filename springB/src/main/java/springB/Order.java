package springB;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Setter
@NoArgsConstructor
@AllArgsConstructor

@Repository("Order")
public class Order {
    @Value("20210504557")
    String id;
    @Value("赵尚凌")
    String clientName;
    @Value("100")
    float money;

    public String toString() {
        return "客户：" + clientName + "，完成订单：" + id + "付款，共人民币：" + money + "元";
    }
}
