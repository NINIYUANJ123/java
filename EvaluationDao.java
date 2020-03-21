package com.travel.bootmall.dao;

import com.travel.bootmall.bean.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: yjw
 * @Date: 2020/03/15/10:53
 * @Description:
 */
public interface EvaluationDao extends JpaRepository<Evaluation,Integer> {
    List<Evaluation> findByEvaname(String evaname);
}
