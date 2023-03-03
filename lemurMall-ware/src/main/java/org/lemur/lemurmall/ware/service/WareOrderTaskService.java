package org.lemur.lemurmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lemur.common.utils.PageUtils;
import org.lemur.lemurmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Lemur
 * @email Lemur@gmail.com
 * @date 2023-02-27 22:59:34
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

