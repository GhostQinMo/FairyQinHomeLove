package FairyQin.HomeLove.fairyqin_member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.common.utils.Query;

import FairyQin.HomeLove.fairyqin_member.dao.MemberCollectSpuDao;
import FairyQin.HomeLove.fairyqin_member.entity.MemberCollectSpuEntity;
import FairyQin.HomeLove.fairyqin_member.service.MemberCollectSpuService;


@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity> implements MemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSpuEntity> page = this.page(
                new Query<MemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<MemberCollectSpuEntity>()
        );

        return new PageUtils(page);
    }

}