package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Config {

    private int showtopic;
    private int showfloor;
    private int showentry;
    private int showadmin;
    @JsonProperty("show_up_flag")
    private boolean showUpFlag;
    @JsonProperty("show_del_log")
    private boolean showDelLog;
    @JsonProperty("read_only")
    private boolean readOnly;
    public void setShowtopic(int showtopic) {
         this.showtopic = showtopic;
     }
     public int getShowtopic() {
         return showtopic;
     }

    public void setShowfloor(int showfloor) {
         this.showfloor = showfloor;
     }
     public int getShowfloor() {
         return showfloor;
     }

    public void setShowentry(int showentry) {
         this.showentry = showentry;
     }
     public int getShowentry() {
         return showentry;
     }

    public void setShowadmin(int showadmin) {
         this.showadmin = showadmin;
     }
     public int getShowadmin() {
         return showadmin;
     }

    public void setShowUpFlag(boolean showUpFlag) {
         this.showUpFlag = showUpFlag;
     }
     public boolean getShowUpFlag() {
         return showUpFlag;
     }

    public void setShowDelLog(boolean showDelLog) {
         this.showDelLog = showDelLog;
     }
     public boolean getShowDelLog() {
         return showDelLog;
     }

    public void setReadOnly(boolean readOnly) {
         this.readOnly = readOnly;
     }
     public boolean getReadOnly() {
         return readOnly;
     }

}