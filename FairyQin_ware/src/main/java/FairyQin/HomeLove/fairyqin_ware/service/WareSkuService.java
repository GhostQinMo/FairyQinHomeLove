package FairyQin.HomeLove.fairyqin_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:02:47
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

