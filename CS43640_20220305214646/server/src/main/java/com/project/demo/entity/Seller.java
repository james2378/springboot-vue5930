package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *卖家：(Seller)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Seller")
public class Seller implements Serializable {

    //Seller编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Integer seller_id;
   // 卖家姓名
   @Basic
    private String seller_name;
   // 身份证号
   @Basic
    private String id_number;
   // 店铺名称
   @Basic
    private String store_name;
   // 店铺位置
   @Basic
    private String store_location;
   // 经营范围
   @Basic
    private String nature_of_business;
   // 店铺特色
   @Basic
    private String shop_features;
   // 店铺编号
   @Basic
    private String shop_number;
   // 相关证件
   @Basic
    private String relevant_certificates;
    // 审核状态
    @Basic
    private String examine_state;
    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
