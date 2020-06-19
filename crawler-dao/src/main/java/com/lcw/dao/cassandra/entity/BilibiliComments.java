package com.lcw.dao.cassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

/**
 * Created By lcw332
 * Time : 2020 06 18 21:09
 * Describe : b站用户评论实体类
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("b_comments")
public class BilibiliComments {

    /**
     * 用户昵称
     */
    @PrimaryKey
    private String nickName;

    /**
     * 评论
     */
    private String comments;

    /**
     * 回复时间
     */
    private Date commentTime;

    /**
     * 点赞人数
     */
    private Long likesCount;

    /**
     * 视频AV号
     */
    private String videoNumber;

    /**
     * 视频地址
     */
    private String videoUrl;

}
