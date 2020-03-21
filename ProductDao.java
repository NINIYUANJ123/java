package com.travel.bootmall.dao;


import com.travel.bootmall.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<User,Integer>{

}
