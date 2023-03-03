package org.lemur.lemurmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lemur.common.utils.PageUtils;
import org.lemur.lemurmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Lemur
 * @email Lemur@gmail.com
 * @date 2023-02-27 22:46:27
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

