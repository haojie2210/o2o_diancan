package com.haojie.service;

import com.haojie.dao.ProductCategoryRepository;
import com.haojie.dao.ProductInfoRepository;
import com.haojie.dao.ProductInfoRepository;
import com.haojie.entity.ProductCategory;
import com.haojie.entity.ProductInfo;
import com.haojie.util.DataTranferTool;
import com.haojie.vo.BuyerProductInfoVO;
import com.haojie.vo.FoodVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/14 14:36
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<BuyerProductInfoVO> selectBuyerFoods() {
        ArrayList<BuyerProductInfoVO> buyerProductInfoVOS = new ArrayList<>();
        List<ProductCategory> categoryList = productCategoryRepository.findAll();
        if (categoryList!=null && categoryList.size()>0){
            for (ProductCategory cate:categoryList){
                BuyerProductInfoVO buyerProductInfoVO = new BuyerProductInfoVO();
                buyerProductInfoVO.setType(cate.getCategoryType());
                buyerProductInfoVO.setName(cate.getCategoryName());

                List<ProductInfo> productInfoList = productInfoRepository.findByCategoryTypeAndProductStatus(cate.getCategoryType(), 0);
                List<FoodVO> foods = new ArrayList();
                if (productInfoList!=null && productInfoList.size()>0){
                    for (ProductInfo info : productInfoList){
                        FoodVO foodVO = DataTranferTool.transferProductInfo(info);
                        foods.add(foodVO);
                    }
                    buyerProductInfoVO.setFoods(foods);
                }
            }
            return buyerProductInfoVOS;
        }
        return buyerProductInfoVOS;
    }
}
