package com.haojie.controller;

import com.haojie.service.ProductService;
import com.haojie.vo.BuyerProductInfoVO;
import com.haojie.vo.CodeMsg;
import com.haojie.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/14 14:18
 */
@RestController
@RequestMapping("/buyer/product/")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("list")
    public ResponseVO<List<BuyerProductInfoVO>> selectBuyerFoods(){
        List<BuyerProductInfoVO> list = productService.selectBuyerFoods();
        if (list==null && list.size()<=0) {
            return ResponseVO.error(CodeMsg.PRODUCT_NOT_EXIST);
        }
        return ResponseVO.success(list);
    }
}
