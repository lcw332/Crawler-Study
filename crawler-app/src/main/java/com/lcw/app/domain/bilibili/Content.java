package com.lcw.app.domain.bilibili;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Content {

    private int plat;
    private String message;
    private List<String> members;
    @JsonProperty("max_line")
    private int maxLine;
    @JsonProperty("jump_url")
    private JumpUrl jumpUrl;
    private String device;
    private Emote emote;



}