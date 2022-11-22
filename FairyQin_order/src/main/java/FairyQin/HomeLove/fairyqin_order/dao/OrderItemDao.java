package FairyQin.HomeLove.fairyqin_order.dao;

import FairyQin.HomeLove.fairyqin_order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:09:40
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
