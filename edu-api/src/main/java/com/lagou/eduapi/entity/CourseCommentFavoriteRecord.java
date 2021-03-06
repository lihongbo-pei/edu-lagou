package com.lagou.eduapi.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author littlelee
 * @date 2022/5/10 14:21
 * @description: 课程留言表(CourseComment)实体类
 */
@Data
@Table(name="course_comment_favorite_record")
public class CourseCommentFavoriteRecord implements Serializable {
    private static final long serialVersionUID = 922554392538715061L;
    /**
     * 主键
     */
    @Id
    private Object id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 留言id
     */
    private Integer commentId;
    /**
     * 是否删除
     */
    private Object isDel;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}