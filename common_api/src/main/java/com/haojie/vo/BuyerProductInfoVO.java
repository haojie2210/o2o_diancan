package com.haojie.vo;

import com.haojie.entity.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/14 14:27
 */
@Data
public class BuyerProductInfoVO {

    private String name;
    private Integer type;
    private List<FoodVO> foods;
}
