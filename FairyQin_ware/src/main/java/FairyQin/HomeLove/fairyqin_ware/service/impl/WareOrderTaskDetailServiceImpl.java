package FairyQin.HomeLove.fairyqin_ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.common.utils.Query;

import FairyQin.HomeLove.fairyqin_ware.dao.WareOrderTaskDetailDao;
import FairyQin.HomeLove.fairyqin_ware.entity.WareOrderTaskDetailEntity;
import FairyQin.HomeLove.fairyqin_ware.service.WareOrderTaskDetailService;


@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetailEntity> implements WareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareOrderTaskDetailEntity> page = this.page(
                new Query<WareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WareOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}