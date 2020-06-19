package com.lcw.app.domain.bilibili;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Data {

    private int vote;
    private Upper upper;
    private String top;
    @JsonProperty("support_mode")
    private Date supportMode;
    @JsonProperty("show_bvid")
    private boolean showBvid;
    private List<Replies> replies;
    private Page page;
    private String notice;
    private int mode;
    @JsonProperty("lottery_card")
    private String lotteryCard;
    private List<Hots> hots;
    private Folder folder;
    private Control control;
    private Config config;
    private int blacklist;
    private int assist;
    public void setVote(int vote) {
         this.vote = vote;
     }
     public int getVote() {
         return vote;
     }

    public void setUpper(Upper upper) {
         this.upper = upper;
     }
     public Upper getUpper() {
         return upper;
     }

    public void setTop(String top) {
         this.top = top;
     }
     public String getTop() {
         return top;
     }

    public void setSupportMode(Date supportMode) {
         this.supportMode = supportMode;
     }
     public Date getSupportMode() {
         return supportMode;
     }

    public void setShowBvid(boolean showBvid) {
         this.showBvid = showBvid;
     }
     public boolean getShowBvid() {
         return showBvid;
     }

    public void setReplies(List<Replies> replies) {
         this.replies = replies;
     }
     public List<Replies> getReplies() {
         return replies;
     }

    public void setPage(Page page) {
         this.page = page;
     }
     public Page getPage() {
         return page;
     }

    public void setNotice(String notice) {
         this.notice = notice;
     }
     public String getNotice() {
         return notice;
     }

    public void setMode(int mode) {
         this.mode = mode;
     }
     public int getMode() {
         return mode;
     }

    public void setLotteryCard(String lotteryCard) {
         this.lotteryCard = lotteryCard;
     }
     public String getLotteryCard() {
         return lotteryCard;
     }

    public void setHots(List<Hots> hots) {
         this.hots = hots;
     }
     public List<Hots> getHots() {
         return hots;
     }

    public void setFolder(Folder folder) {
         this.folder = folder;
     }
     public Folder getFolder() {
         return folder;
     }

    public void setControl(Control control) {
         this.control = control;
     }
     public Control getControl() {
         return control;
     }

    public void setConfig(Config config) {
         this.config = config;
     }
     public Config getConfig() {
         return config;
     }

    public void setBlacklist(int blacklist) {
         this.blacklist = blacklist;
     }
     public int getBlacklist() {
         return blacklist;
     }

    public void setAssist(int assist) {
         this.assist = assist;
     }
     public int getAssist() {
         return assist;
     }

}