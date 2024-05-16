package springA.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Order {
    String id;
    String clientName;
    float money;

    public String toString() {
        return "客户：" + clientName + "，完成订单：" + id + "付款，共人民币：" + money + "元";
    }
}
