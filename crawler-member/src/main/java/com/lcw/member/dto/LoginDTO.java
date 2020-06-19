package com.lcw.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By lcw332
 * Time : 2020 06 18 23:08
 * Describe : 用户登陆DTO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {

    private String userName;

    private String password;

    private String authCode;

    private String countryCode;
}
