package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Pendant {

    private int pid;
    private String name;
    @JsonProperty("image_enhance")
    private String imageEnhance;
    private String image;
    private int expire;
    public void setPid(int pid) {
         this.pid = pid;
     }
     public int getPid() {
         return pid;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setImageEnhance(String imageEnhance) {
         this.imageEnhance = imageEnhance;
     }
     public String getImageEnhance() {
         return imageEnhance;
     }

    public void setImage(String image) {
         this.image = image;
     }
     public String getImage() {
         return image;
     }

    public void setExpire(int expire) {
         this.expire = expire;
     }
     public int getExpire() {
         return expire;
     }

}