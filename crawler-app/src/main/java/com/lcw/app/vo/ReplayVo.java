package com.lcw.app.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By lcw332
 * Time : 2020 06 19 23:12
 * Describe :
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplayVo {

    /**
     * 回复的消息内容
     */
    private String message;

    /**
     * 回复的点赞次数
     */
    private Long like;


}
