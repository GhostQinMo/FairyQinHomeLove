package FairyQin.HomeLove.fairyqin_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:02:47
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

