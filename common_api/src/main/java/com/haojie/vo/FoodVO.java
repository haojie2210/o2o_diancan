package com.haojie.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/14 20:11
 */
@Data
public class FoodVO {

    private String id;
    private String name;
    private BigDecimal price;
    private String description;
    private String icon;
}
