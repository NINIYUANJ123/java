package com.travel.bootmall.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @Auther: yjw
 * @Date: 2020/03/14/18:25
 * @Description:
 */
@Entity
@Data
//@Table(name = "tips")
public class Tips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
}
