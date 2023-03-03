package org.lemur.lemurmall.ware.dao;

import org.lemur.lemurmall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Lemur
 * @email Lemur@gmail.com
 * @date 2023-02-27 22:59:34
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
