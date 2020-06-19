package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Folder {

    private String rule;
    @JsonProperty("is_folded")
    private boolean isFolded;
    @JsonProperty("has_folded")
    private boolean hasFolded;
    public void setRule(String rule) {
         this.rule = rule;
     }
     public String getRule() {
         return rule;
     }

    public void setIsFolded(boolean isFolded) {
         this.isFolded = isFolded;
     }
     public boolean getIsFolded() {
         return isFolded;
     }

    public void setHasFolded(boolean hasFolded) {
         this.hasFolded = hasFolded;
     }
     public boolean getHasFolded() {
         return hasFolded;
     }

}