package FairyQin.HomeLove.fairyqin_member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:17:59
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

