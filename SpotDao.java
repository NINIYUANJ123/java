package com.travel.bootmall.dao;

import com.travel.bootmall.bean.Spot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/10:20
 * @Description:
 */
public interface SpotDao extends JpaRepository<Spot,Integer> {
    Spot findBySponame(String cityname);
    Page<Spot> findAll(Pageable pageable);
}
