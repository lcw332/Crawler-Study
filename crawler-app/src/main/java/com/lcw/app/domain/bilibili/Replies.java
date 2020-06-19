package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Replies {

    @JsonProperty("up_action")
    private UpAction upAction;
    private int type;
    private int state;
    @JsonProperty("show_follow")
    private boolean showFollow;
    @JsonProperty("rpid_str")
    private String rpidStr;
    private int rpid;
    @JsonProperty("root_str")
    private String rootStr;
    private int root;
    private String replies;
    private int rcount;
    @JsonProperty("parent_str")
    private String parentStr;
    private int parent;
    private int oid;
    private int mid;
    private Member member;
    private int like;
    private Folder folder;
    private int fansgrade;
    private int dialog;
    private int ctime;
    private int count;
    private Content content;
    private int attr;
    private int assist;
    private int action;
    public void setUpAction(UpAction upAction) {
         this.upAction = upAction;
     }
     public UpAction getUpAction() {
         return upAction;
     }

    public void setType(int type) {
         this.type = type;
     }
     public int getType() {
         return type;
     }

    public void setState(int state) {
         this.state = state;
     }
     public int getState() {
         return state;
     }

    public void setShowFollow(boolean showFollow) {
         this.showFollow = showFollow;
     }
     public boolean getShowFollow() {
         return showFollow;
     }

    public void setRpidStr(String rpidStr) {
         this.rpidStr = rpidStr;
     }
     public String getRpidStr() {
         return rpidStr;
     }

    public void setRpid(int rpid) {
         this.rpid = rpid;
     }
     public int getRpid() {
         return rpid;
     }

    public void setRootStr(String rootStr) {
         this.rootStr = rootStr;
     }
     public String getRootStr() {
         return rootStr;
     }

    public void setRoot(int root) {
         this.root = root;
     }
     public int getRoot() {
         return root;
     }

    public void setReplies(String replies) {
         this.replies = replies;
     }
     public String getReplies() {
         return replies;
     }

    public void setRcount(int rcount) {
         this.rcount = rcount;
     }
     public int getRcount() {
         return rcount;
     }

    public void setParentStr(String parentStr) {
         this.parentStr = parentStr;
     }
     public String getParentStr() {
         return parentStr;
     }

    public void setParent(int parent) {
         this.parent = parent;
     }
     public int getParent() {
         return parent;
     }

    public void setOid(int oid) {
         this.oid = oid;
     }
     public int getOid() {
         return oid;
     }

    public void setMid(int mid) {
         this.mid = mid;
     }
     public int getMid() {
         return mid;
     }

    public void setMember(Member member) {
         this.member = member;
     }
     public Member getMember() {
         return member;
     }

    public void setLike(int like) {
         this.like = like;
     }
     public int getLike() {
         return like;
     }

    public void setFolder(Folder folder) {
         this.folder = folder;
     }
     public Folder getFolder() {
         return folder;
     }

    public void setFansgrade(int fansgrade) {
         this.fansgrade = fansgrade;
     }
     public int getFansgrade() {
         return fansgrade;
     }

    public void setDialog(int dialog) {
         this.dialog = dialog;
     }
     public int getDialog() {
         return dialog;
     }

    public void setCtime(int ctime) {
         this.ctime = ctime;
     }
     public int getCtime() {
         return ctime;
     }

    public void setCount(int count) {
         this.count = count;
     }
     public int getCount() {
         return count;
     }

    public void setContent(Content content) {
         this.content = content;
     }
     public Content getContent() {
         return content;
     }

    public void setAttr(int attr) {
         this.attr = attr;
     }
     public int getAttr() {
         return attr;
     }

    public void setAssist(int assist) {
         this.assist = assist;
     }
     public int getAssist() {
         return assist;
     }

    public void setAction(int action) {
         this.action = action;
     }
     public int getAction() {
         return action;
     }

}