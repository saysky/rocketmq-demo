package com.liuyanzhao.rocketmq.producer.demo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单对象
 * @author 言曌
 * @date 2020/9/15 11:48 下午
 */

public class OrderDTO implements Serializable {

    private String id;

    private String itemId;

    private String userId;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public OrderDTO() {
    }

    public OrderDTO(String id, String itemId, String userId, Date createTime) {
        this.id = id;
        this.itemId = itemId;
        this.userId = userId;
        this.createTime = createTime;
    }
}
