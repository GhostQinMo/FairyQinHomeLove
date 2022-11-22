package FairyQin.HomeLove.fairyqin_order.dao;

import FairyQin.HomeLove.fairyqin_order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:09:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
