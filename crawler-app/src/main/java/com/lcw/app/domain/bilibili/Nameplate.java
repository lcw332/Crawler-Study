package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Nameplate {

    private int nid;
    private String name;
    private String level;
    @JsonProperty("image_small")
    private String imageSmall;
    private String image;
    private String condition;
    public void setNid(int nid) {
         this.nid = nid;
     }
     public int getNid() {
         return nid;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setLevel(String level) {
         this.level = level;
     }
     public String getLevel() {
         return level;
     }

    public void setImageSmall(String imageSmall) {
         this.imageSmall = imageSmall;
     }
     public String getImageSmall() {
         return imageSmall;
     }

    public void setImage(String image) {
         this.image = image;
     }
     public String getImage() {
         return image;
     }

    public void setCondition(String condition) {
         this.condition = condition;
     }
     public String getCondition() {
         return condition;
     }

}