package com.travel.bootmall.service;

import com.travel.bootmall.bean.Artical;
import com.travel.bootmall.dao.ArticalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/10:35
 * @Description:
 */
@Service
public class ArticalService {
    @Autowired
    ArticalDao articalDao;

    public Artical findByArtname(String artname){
        return articalDao.findByArtname(artname);
    }

}
