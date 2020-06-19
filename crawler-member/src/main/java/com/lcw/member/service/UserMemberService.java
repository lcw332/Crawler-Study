package com.lcw.member.service;

import com.lcw.common.api.CommonResult;
import com.lcw.member.dto.LoginDTO;

/**
 * Created By lcw332
 * Time : 2020 06 18 22:58
 * Describe :
 **/
public interface UserMemberService {

    CommonResult<?> login(LoginDTO dto);

}
