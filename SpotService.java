package com.travel.bootmall.service;

import com.travel.bootmall.bean.Spot;
import com.travel.bootmall.dao.EvaluationDao;
import com.travel.bootmall.dao.SpotDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/10:27
 * @Description:
 */
@Service
public class SpotService {
    @Autowired
    SpotDao spotDao;
    @Autowired
    EvaluationDao evaluationDao;
    public Spot findBySpotCity(String sponame){
        Spot spot = spotDao.findBySponame(sponame);
        spot.setEvaluation(evaluationDao.findByEvaname(sponame));
        return spot;
    }
    public Page<Spot> findAll(Pageable pageable){
        return spotDao.findAll(pageable);
    }
}
