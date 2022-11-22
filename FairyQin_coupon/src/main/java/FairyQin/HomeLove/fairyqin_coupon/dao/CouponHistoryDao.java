package FairyQin.HomeLove.fairyqin_coupon.dao;

import FairyQin.HomeLove.fairyqin_coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:15:32
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
