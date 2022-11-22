package FairyQin.HomeLove.fairyqin_order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import FairyQin.HomeLove.common.utils.PageUtils;
import FairyQin.HomeLove.common.utils.Query;

import FairyQin.HomeLove.fairyqin_order.dao.PaymentInfoDao;
import FairyQin.HomeLove.fairyqin_order.entity.PaymentInfoEntity;
import FairyQin.HomeLove.fairyqin_order.service.PaymentInfoService;


@Service("paymentInfoService")
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfoEntity> implements PaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PaymentInfoEntity> page = this.page(
                new Query<PaymentInfoEntity>().getPage(params),
                new QueryWrapper<PaymentInfoEntity>()
        );

        return new PageUtils(page);
    }

}