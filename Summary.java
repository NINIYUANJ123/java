package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/17:17
 * @Description: 景点介绍的简介页(小故事)
 */
@Entity
@Data
//@Table(name = "summary")
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Column
    private String sumcity;
    //@Column
    private String sumtext;
    //@Column
    private String sumpicture;
}
