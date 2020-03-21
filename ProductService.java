package com.travel.bootmall.service;

import com.travel.bootmall.bean.User;
import com.travel.bootmall.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public List<User> tickAll(){
        return productDao.findAll();
    }


    public User renewProduct(User product){
        return productDao.save(product);
    }

}
