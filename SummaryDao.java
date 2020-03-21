package com.travel.bootmall.dao;

import com.travel.bootmall.bean.Summary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/11:00
 * @Description:
 */
public interface SummaryDao extends JpaRepository<Summary,Integer>{
    List<Summary> findAll();
}
