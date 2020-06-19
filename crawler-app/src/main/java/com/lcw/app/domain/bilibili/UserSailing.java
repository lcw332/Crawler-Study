package com.lcw.app.domain.bilibili;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Auto-generated: 2020-06-19 21:8:3
 *
 * @author www.jsons.cn 
 * @website http://www.jsons.cn/json2java/ 
 */
public class UserSailing {

    private String pendant;
    @JsonProperty("cardbg_with_focus")
    private String cardbgWithFocus;
    private String cardbg;
    public void setPendant(String pendant) {
         this.pendant = pendant;
     }
     public String getPendant() {
         return pendant;
     }

    public void setCardbgWithFocus(String cardbgWithFocus) {
         this.cardbgWithFocus = cardbgWithFocus;
     }
     public String getCardbgWithFocus() {
         return cardbgWithFocus;
     }

    public void setCardbg(String cardbg) {
         this.cardbg = cardbg;
     }
     public String getCardbg() {
         return cardbg;
     }

}