package com.haojie.dao;

import com.haojie.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByCategoryTypeAndProductStatus(Integer categoryType,Integer status);
}
