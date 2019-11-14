package com.haojie.util;

import com.haojie.entity.ProductInfo;
import com.haojie.vo.BuyerProductInfoVO;
import com.haojie.vo.FoodVO;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/14 20:18
 */
public class DataTranferTool {

    public static FoodVO transferProductInfo(ProductInfo productInfo){
        FoodVO foodVO = new FoodVO();
        foodVO.setDescription(productInfo.getProductDescription());
        foodVO.setIcon(productInfo.getProductIcon());
        foodVO.setId(productInfo.getProductId());
        foodVO.setName(productInfo.getProductName());
        foodVO.setPrice(productInfo.getProductPrice());
        return foodVO;
    }
}
