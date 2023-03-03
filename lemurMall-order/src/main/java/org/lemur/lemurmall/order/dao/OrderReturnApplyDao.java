package org.lemur.lemurmall.order.dao;

import org.lemur.lemurmall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author Lemur
 * @email Lemur@gmail.com
 * @date 2023-02-27 22:56:20
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
