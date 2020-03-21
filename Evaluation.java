package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/17:39
 * @Description:  游客的评价
 */
@Entity
@Data
//@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //@Column
    private String evaname;
    //@Column
    private String evauser;
    //@Column
    private String evatext;
}
