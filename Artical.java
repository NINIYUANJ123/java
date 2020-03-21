package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/17:24
 * @Description: 游玩攻略与游客计划
 */
@Entity
@Data
//@Table(name = "artical")
public class Artical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Column
    private String artname;
    //@Column
    private String arttitle;
    //@Column
    private String artttext;
}
