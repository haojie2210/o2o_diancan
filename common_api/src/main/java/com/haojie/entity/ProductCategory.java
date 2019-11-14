package com.haojie.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ：单击开始
 * @description：productcategory 实体类
 * @date ：Created in 2019/11/14 10:26
 */
@Data
@Table(name = "product_category")
@Entity
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 397886211406167700L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
