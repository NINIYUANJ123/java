package com.travel.bootmall.dao;

import com.travel.bootmall.bean.Artical;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/10:32
 * @Description:
 */
public interface ArticalDao extends JpaRepository<Artical,Integer> {
    Artical findByArtname(String artname);
}
