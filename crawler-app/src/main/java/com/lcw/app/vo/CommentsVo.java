package com.lcw.app.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * Created By lcw332
 * Time : 2020 06 19 19:57
 * Describe :
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentsVo {

    /**
     * 总回复量
     */
    private Long replayCount;

    /**
     * top词汇量
     */
    private List<Map<Integer,String>> topKeywords;
}
