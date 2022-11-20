package FairyQin.HomeLove.fairyqin_order;

import FairyQin.HomeLove.fairyqin_order.entity.OrderEntity;
import FairyQin.HomeLove.fairyqin_order.service.OrderService;
import com.mysql.cj.log.LogFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class FairyQinOrderApplicationTests {


    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillContent("学生经，FairyQin");
        boolean save = orderService.save(orderEntity);
        log.info("输出的结果为："+save);
    }

}
