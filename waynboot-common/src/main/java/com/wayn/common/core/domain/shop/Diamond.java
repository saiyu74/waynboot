package com.wayn.common.core.domain.shop;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wayn.common.base.entity.ShopBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 首页金刚区配置
 * </p>
 *
 * @author wayn
 * @since 2020-10-10
 */
@Data
@TableName("shop_diamond")
@EqualsAndHashCode(callSuper = false)
public class Diamond extends ShopBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 金刚区名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sortOrder;

    /**
     * 金刚区跳转类型（0栏目，1分类，2url）
     */
    private Integer jumpType;

    /**
     * 跳转栏目ID或者分类ID
     */
    private Integer valueId;

    /**
     * 跳转连接
     */
    private String valueUrl;

    /**
     * 展示图标
     */
    private String icon;

    /**
     * 展示banner
     */
    private String image;

    /**
     * 是否展示（0不展示，1展示）
     */
    private Boolean status;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    private Boolean delFlag;

}
