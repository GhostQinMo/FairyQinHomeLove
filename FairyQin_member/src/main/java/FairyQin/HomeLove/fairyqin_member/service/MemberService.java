package FairyQin.HomeLove.fairyqin_member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.fairyqin_member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author FairyQin
 * @email 2095215135@gmail.com
 * @date 2022-11-20 18:17:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

