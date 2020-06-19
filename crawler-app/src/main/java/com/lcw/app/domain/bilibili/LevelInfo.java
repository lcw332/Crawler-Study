package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class LevelInfo {

    @JsonProperty("next_exp")
    private int nextExp;
    @JsonProperty("current_min")
    private int currentMin;
    @JsonProperty("current_level")
    private int currentLevel;
    @JsonProperty("current_exp")
    private int currentExp;
    public void setNextExp(int nextExp) {
         this.nextExp = nextExp;
     }
     public int getNextExp() {
         return nextExp;
     }

    public void setCurrentMin(int currentMin) {
         this.currentMin = currentMin;
     }
     public int getCurrentMin() {
         return currentMin;
     }

    public void setCurrentLevel(int currentLevel) {
         this.currentLevel = currentLevel;
     }
     public int getCurrentLevel() {
         return currentLevel;
     }

    public void setCurrentExp(int currentExp) {
         this.currentExp = currentExp;
     }
     public int getCurrentExp() {
         return currentExp;
     }

}