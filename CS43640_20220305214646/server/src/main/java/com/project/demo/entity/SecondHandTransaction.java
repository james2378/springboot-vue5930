package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *二手交易：(SecondHandTransaction)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "SecondHandTransaction")
public class SecondHandTransaction implements Serializable {

    //SecondHandTransaction编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "second_hand_transaction_id")
    private Integer second_hand_transaction_id;
   // 物品名称
   @Basic
    private String item_name;
   // 物品类型
   @Basic
    private String item_type;
   // 物品成色
   @Basic
    private String article_fineness;
   // 物品图片
   @Basic
    private String item_picture;
   // 物品价格
   @Basic
    private String item_price;
   // 用户编号
   @Basic
    private Integer user_number;
   // 用户手机号
   @Basic
    private String user_mobile_number;
   // 交易状态
   @Basic
    private String transaction_status;
   // 物品详情
   @Basic
    private String item_details;
    // 点击数
    @Basic
    private Integer hits;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
