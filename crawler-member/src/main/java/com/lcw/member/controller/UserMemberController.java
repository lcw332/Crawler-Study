package com.lcw.member.controller;

import com.lcw.common.api.CommonResult;
import com.lcw.common.exception.ApiException;
import com.lcw.member.dto.LoginDTO;
import com.lcw.member.service.UserMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By lcw332
 * Time : 2020 06 18 22:37
 * Describe : 用户接口
 **/
@RestController
@RequestMapping("/api/v1/user/member")
@Api("用户接口")
public class UserMemberController {

    private final UserMemberService memberService;

    @Autowired
    public UserMemberController(UserMemberService memberService) {
        this.memberService = memberService;
    }

    @ApiOperation("登陆接口")
    @PostMapping("/login")
    public CommonResult<?> userLogin(@RequestBody LoginDTO dto) throws ApiException {
        return memberService.login(dto);
    }



}
