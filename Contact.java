package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/17:56
 * @Description:  景点联系方式
 */
@Entity
@Data
//@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   // @Column
    private String concity;
}
