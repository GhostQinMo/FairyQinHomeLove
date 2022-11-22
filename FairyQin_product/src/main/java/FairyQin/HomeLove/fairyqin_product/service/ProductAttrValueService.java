package FairyQin.HomeLove.fairyqin_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:06:56
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

