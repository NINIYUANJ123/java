package com.travel.bootmall.service;

import com.travel.bootmall.bean.Summary;
import com.travel.bootmall.dao.SummaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/11:04
 * @Description:
 */
@Service
public class SummaryService {
    @Autowired
    SummaryDao summaryDao;
    List<Summary> SaveAll(){
        return summaryDao.findAll();
    }
}
