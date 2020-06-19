package com.lcw.dao.dao;

import com.lcw.dao.entity.MemberUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By lcw332
 * Time : 2020 06 18 21:07
 * Describe : 前台用户Dao
 **/
public interface MemberUserDao extends JpaRepository<MemberUser,String> {
}
