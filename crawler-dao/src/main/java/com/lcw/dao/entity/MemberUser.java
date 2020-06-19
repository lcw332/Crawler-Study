package com.lcw.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created By lcw332
 * Time : 2020 06 18 21:03
 * Describe : 前台用户相关
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_member")
public class MemberUser implements Serializable {

    /**
     * ID,UUID的方式插入到数据库中
     */
    @Id
    private String id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 微信OpenId
     */
    private String weChatOpenId;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
