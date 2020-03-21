package com.travel.bootmall.bean;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/17:17
 * @Description: 景点图文详细介绍
 */
@Entity
@Data
//@Table(name = "spot")
public class Spot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   // @Column
    private String sponame;
    //@Column
    private String spotitle;
    private String spourl1;
    private String spourl2;
    private String spourl3;
    //@Column
    private String spotext1;
    private String spotext2;
    private String spotext3;
    @Transient
    private List<Evaluation> evaluation;
}
