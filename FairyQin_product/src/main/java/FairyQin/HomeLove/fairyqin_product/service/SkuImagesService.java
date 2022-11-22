package FairyQin.HomeLove.fairyqin_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:06:56
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

