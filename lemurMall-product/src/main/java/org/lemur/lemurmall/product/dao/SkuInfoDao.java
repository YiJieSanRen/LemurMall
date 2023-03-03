package org.lemur.lemurmall.product.dao;

import org.lemur.lemurmall.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author Lemur
 * @email Lemur@gmail.com
 * @date 2023-02-27 15:08:46
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
