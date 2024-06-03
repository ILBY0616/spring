package springA.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    String id;
    String username;
    float money;

    public String toString() {
        return "客户：" + username + "，完成订单：" + id + "付款，共人民币：" + money + "元";
    }
}
