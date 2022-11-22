package FairyQin.HomeLove.fairyqin_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:02:47
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

