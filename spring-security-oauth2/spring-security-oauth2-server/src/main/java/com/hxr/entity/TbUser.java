package com.hxr.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: TbUser
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 16:58
 * @Version: 1.0
 **/
@Data
@Table(name = "tb_user")
public class TbUser implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    // 实体类中属性与数据表中字段的对应关系
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "created")
    private Date created;

    @Column(name = "updated")
    private Date updated;

    private static  final  long seriaVersionUID =1L;



}
