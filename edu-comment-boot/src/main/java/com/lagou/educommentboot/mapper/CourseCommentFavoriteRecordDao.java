package com.lagou.educommentboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lagou.eduapi.entity.CourseCommentFavoriteRecord;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author littlelee
 * @date 2022/5/10 14:24
 * @description:
 */
public interface CourseCommentFavoriteRecordDao extends BaseMapper<CourseCommentFavoriteRecord> {

    @Select({"select * from course_comment_favorite_record where comment_id = #{comment_id}"})
    List<CourseCommentFavoriteRecord> findByCommentid(Integer comment_id);

}
