package com.travel.bootmall.controller;

import com.travel.bootmall.bean.Artical;
import com.travel.bootmall.bean.Spot;
import com.travel.bootmall.bean.Summary;
import com.travel.bootmall.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/11:07
 * @Description:
 */
@Controller
@RequestMapping("/recommend")
public class FirstController {
    @Autowired
    ArticalDao articalDao;
    @Autowired
    EvaluationDao evaluationDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    SpotDao spotDao;
    @Autowired
    SummaryDao summaryDao;

    @GetMapping("/spot/all")
    public String getAll(
            @RequestParam(value = "start",defaultValue = "0") Integer start,
            @RequestParam(value = "limit",defaultValue = "6") Integer limit,
            ModelMap map){
        Sort sort = new Sort(Sort.DEFAULT_DIRECTION,"id");
        Pageable pageable = PageRequest.of(start,limit,sort);
        Page<Spot> page = spotDao.findAll(pageable);
        map.put("page",page);
        return "List";
    }

    @GetMapping("/spot/{spotname}")
    public Spot getSpot(@PathVariable("spotname") String spotname){
        return spotDao.findBySponame(spotname);
    }

    @GetMapping
    @RequestMapping("/artical/{name}")
    public Artical getArt(@PathVariable("name") String name){
        return articalDao.findByArtname(name);
    }

    @GetMapping
    @RequestMapping("/summary")
    public String getAllSummary(ModelMap map){
        List<Summary> summaries = summaryDao.findAll();
        map.put("summarys",summaries);
        return "product1";
    }


}
