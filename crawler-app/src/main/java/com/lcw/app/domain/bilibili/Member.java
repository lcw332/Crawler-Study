package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Member {

    private Vip vip;
    @JsonProperty("user_sailing")
    private UserSailing userSailing;
    private String uname;
    private String sign;
    private String sex;
    private String rank;
    private Pendant pendant;
    @JsonProperty("official_verify")
    private OfficialVerify officialVerify;
    private Nameplate nameplate;
    private String mid;
    @JsonProperty("level_info")
    private LevelInfo levelInfo;
    @JsonProperty("is_followed")
    private int isFollowed;
    private int following;
    @JsonProperty("fans_detail")
    private String fansDetail;
    @JsonProperty("DisplayRank")
    private String displayrank;
    private String avatar;
    public void setVip(Vip vip) {
         this.vip = vip;
     }
     public Vip getVip() {
         return vip;
     }

    public void setUserSailing(UserSailing userSailing) {
         this.userSailing = userSailing;
     }
     public UserSailing getUserSailing() {
         return userSailing;
     }

    public void setUname(String uname) {
         this.uname = uname;
     }
     public String getUname() {
         return uname;
     }

    public void setSign(String sign) {
         this.sign = sign;
     }
     public String getSign() {
         return sign;
     }

    public void setSex(String sex) {
         this.sex = sex;
     }
     public String getSex() {
         return sex;
     }

    public void setRank(String rank) {
         this.rank = rank;
     }
     public String getRank() {
         return rank;
     }

    public void setPendant(Pendant pendant) {
         this.pendant = pendant;
     }
     public Pendant getPendant() {
         return pendant;
     }

    public void setOfficialVerify(OfficialVerify officialVerify) {
         this.officialVerify = officialVerify;
     }
     public OfficialVerify getOfficialVerify() {
         return officialVerify;
     }

    public void setNameplate(Nameplate nameplate) {
         this.nameplate = nameplate;
     }
     public Nameplate getNameplate() {
         return nameplate;
     }

    public void setMid(String mid) {
         this.mid = mid;
     }
     public String getMid() {
         return mid;
     }

    public void setLevelInfo(LevelInfo levelInfo) {
         this.levelInfo = levelInfo;
     }
     public LevelInfo getLevelInfo() {
         return levelInfo;
     }

    public void setIsFollowed(int isFollowed) {
         this.isFollowed = isFollowed;
     }
     public int getIsFollowed() {
         return isFollowed;
     }

    public void setFollowing(int following) {
         this.following = following;
     }
     public int getFollowing() {
         return following;
     }

    public void setFansDetail(String fansDetail) {
         this.fansDetail = fansDetail;
     }
     public String getFansDetail() {
         return fansDetail;
     }

    public void setDisplayrank(String displayrank) {
         this.displayrank = displayrank;
     }
     public String getDisplayrank() {
         return displayrank;
     }

    public void setAvatar(String avatar) {
         this.avatar = avatar;
     }
     public String getAvatar() {
         return avatar;
     }

}