package FairyQin.HomeLove.fairyqin_ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.common.utils.Query;

import FairyQin.HomeLove.fairyqin_ware.dao.UndoLogDao;
import FairyQin.HomeLove.fairyqin_ware.entity.UndoLogEntity;
import FairyQin.HomeLove.fairyqin_ware.service.UndoLogService;


@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLogEntity> implements UndoLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UndoLogEntity> page = this.page(
                new Query<UndoLogEntity>().getPage(params),
                new QueryWrapper<UndoLogEntity>()
        );

        return new PageUtils(page);
    }

}