package com.haojie.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ：单击开始
 * @description：product_info
 * @date ：Created in 2019/11/14 10:36
 */
@Data
@Table(name = "product_info")
@Entity
public class ProductInfo implements Serializable {
    private static final long serialVersionUID = 2885285571966797847L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus = 0;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

}
