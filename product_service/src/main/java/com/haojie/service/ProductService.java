package com.haojie.service;

import com.haojie.vo.BuyerProductInfoVO;

import java.util.List;

public interface ProductService {
    /*查出商品类别下的所有上架商品*/
    List<BuyerProductInfoVO> selectBuyerFoods();
}
