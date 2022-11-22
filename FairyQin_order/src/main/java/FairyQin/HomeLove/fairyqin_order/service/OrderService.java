package FairyQin.HomeLove.fairyqin_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:09:40
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

