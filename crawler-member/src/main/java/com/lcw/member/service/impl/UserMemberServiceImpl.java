package com.lcw.member.service.impl;

import com.lcw.common.api.CommonResult;
import com.lcw.dao.dao.MemberUserDao;
import com.lcw.member.dto.LoginDTO;
import com.lcw.member.service.UserMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By lcw332
 * Time : 2020 06 18 22:59
 * Describe :
 **/
@Service
public class UserMemberServiceImpl implements UserMemberService {

    private final MemberUserDao memberUserDao;

    @Autowired
    public UserMemberServiceImpl(MemberUserDao memberUserDao) {
        this.memberUserDao = memberUserDao;
    }

    public CommonResult<?> login(LoginDTO dto) {

        return null;
    }
}
