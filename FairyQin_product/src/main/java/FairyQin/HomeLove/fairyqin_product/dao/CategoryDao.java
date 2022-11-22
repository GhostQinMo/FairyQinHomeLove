package FairyQin.HomeLove.fairyqin_product.dao;

import FairyQin.HomeLove.fairyqin_product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:06:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
