package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class Control {

    @JsonProperty("web_selection")
    private boolean webSelection;
    @JsonProperty("root_input_text")
    private String rootInputText;
    @JsonProperty("input_disable")
    private boolean inputDisable;
    @JsonProperty("child_input_text")
    private String childInputText;
    @JsonProperty("bg_text")
    private String bgText;
    @JsonProperty("answer_guide_text")
    private String answerGuideText;
    @JsonProperty("answer_guide_ios_url")
    private String answerGuideIosUrl;
    @JsonProperty("answer_guide_icon_url")
    private String answerGuideIconUrl;
    @JsonProperty("answer_guide_android_url")
    private String answerGuideAndroidUrl;
    public void setWebSelection(boolean webSelection) {
         this.webSelection = webSelection;
     }
     public boolean getWebSelection() {
         return webSelection;
     }

    public void setRootInputText(String rootInputText) {
         this.rootInputText = rootInputText;
     }
     public String getRootInputText() {
         return rootInputText;
     }

    public void setInputDisable(boolean inputDisable) {
         this.inputDisable = inputDisable;
     }
     public boolean getInputDisable() {
         return inputDisable;
     }

    public void setChildInputText(String childInputText) {
         this.childInputText = childInputText;
     }
     public String getChildInputText() {
         return childInputText;
     }

    public void setBgText(String bgText) {
         this.bgText = bgText;
     }
     public String getBgText() {
         return bgText;
     }

    public void setAnswerGuideText(String answerGuideText) {
         this.answerGuideText = answerGuideText;
     }
     public String getAnswerGuideText() {
         return answerGuideText;
     }

    public void setAnswerGuideIosUrl(String answerGuideIosUrl) {
         this.answerGuideIosUrl = answerGuideIosUrl;
     }
     public String getAnswerGuideIosUrl() {
         return answerGuideIosUrl;
     }

    public void setAnswerGuideIconUrl(String answerGuideIconUrl) {
         this.answerGuideIconUrl = answerGuideIconUrl;
     }
     public String getAnswerGuideIconUrl() {
         return answerGuideIconUrl;
     }

    public void setAnswerGuideAndroidUrl(String answerGuideAndroidUrl) {
         this.answerGuideAndroidUrl = answerGuideAndroidUrl;
     }
     public String getAnswerGuideAndroidUrl() {
         return answerGuideAndroidUrl;
     }

}