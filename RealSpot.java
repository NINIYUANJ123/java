package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/18:04
 * @Description:  3D全景
 */
@Entity
@Data
//@Table(name = "realspot")
public class RealSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Column
    private String realcity;
    //@Column
    private String url;
}
