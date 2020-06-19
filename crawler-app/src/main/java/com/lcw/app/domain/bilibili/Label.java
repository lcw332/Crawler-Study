package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Label {

    private String text;
    private String path;
    @JsonProperty("label_theme")
    private String labelTheme;
    public void setText(String text) {
         this.text = text;
     }
     public String getText() {
         return text;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setLabelTheme(String labelTheme) {
         this.labelTheme = labelTheme;
     }
     public String getLabelTheme() {
         return labelTheme;
     }

}