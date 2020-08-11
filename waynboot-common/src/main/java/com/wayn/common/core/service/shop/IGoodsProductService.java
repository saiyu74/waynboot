package com.wayn.common.core.service.shop;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wayn.common.core.domain.shop.GoodsProduct;

/**
 * <p>
 * 商品货品表 服务类
 * </p>
 *
 * @author wayn
 * @since 2020-07-06
 */
public interface IGoodsProductService extends IService<GoodsProduct> {

    /**
     * 减少库存
     * @param productId 商品货品ID
     * @param number 减少数量
     * @return boolean
     */
    boolean reduceStock(Integer productId, Integer number);
}
