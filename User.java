package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * @Auther: yjw
 * @Date: 2020/03/14/17:17
 * @Description: 用户信息
 */
@Data
@Entity
//@Table(name = "product1")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Column
    private String name;
    //@Column
    private String password;
    //@Column
    private String email;  //注册邮箱,用于注册时的邮箱验证
}
