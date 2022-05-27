package com.lagou.eduorderboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lagou.eduorderboot.entity.UserCourseOrder;
import org.springframework.stereotype.Service;

/**
 * @author littlelee
 * @date 2022/5/10 17:04
 * @description:
 */
@Service
public interface OrderDao extends BaseMapper<UserCourseOrder> {
}
