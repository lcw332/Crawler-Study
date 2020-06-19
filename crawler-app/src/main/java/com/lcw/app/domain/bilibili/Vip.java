package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Vip {

    @JsonProperty("vipType")
    private int viptype;
    @JsonProperty("vipStatusWarn")
    private String vipstatuswarn;
    @JsonProperty("vipStatus")
    private int vipstatus;
    @JsonProperty("vipDueDate")
    private int vipduedate;
    @JsonProperty("themeType")
    private int themetype;
    private Label label;
    @JsonProperty("dueRemark")
    private String dueremark;
    @JsonProperty("accessStatus")
    private int accessstatus;
    public void setViptype(int viptype) {
         this.viptype = viptype;
     }
     public int getViptype() {
         return viptype;
     }

    public void setVipstatuswarn(String vipstatuswarn) {
         this.vipstatuswarn = vipstatuswarn;
     }
     public String getVipstatuswarn() {
         return vipstatuswarn;
     }

    public void setVipstatus(int vipstatus) {
         this.vipstatus = vipstatus;
     }
     public int getVipstatus() {
         return vipstatus;
     }

    public void setVipduedate(int vipduedate) {
         this.vipduedate = vipduedate;
     }
     public int getVipduedate() {
         return vipduedate;
     }

    public void setThemetype(int themetype) {
         this.themetype = themetype;
     }
     public int getThemetype() {
         return themetype;
     }

    public void setLabel(Label label) {
         this.label = label;
     }
     public Label getLabel() {
         return label;
     }

    public void setDueremark(String dueremark) {
         this.dueremark = dueremark;
     }
     public String getDueremark() {
         return dueremark;
     }

    public void setAccessstatus(int accessstatus) {
         this.accessstatus = accessstatus;
     }
     public int getAccessstatus() {
         return accessstatus;
     }

}