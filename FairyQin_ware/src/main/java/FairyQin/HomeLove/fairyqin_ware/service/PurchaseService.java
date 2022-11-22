package FairyQin.HomeLove.fairyqin_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:02:47
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

