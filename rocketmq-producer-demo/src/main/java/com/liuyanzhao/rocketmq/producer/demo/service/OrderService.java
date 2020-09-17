package com.liuyanzhao.rocketmq.producer.demo.service;

import com.liuyanzhao.rocketmq.producer.demo.dto.OrderDTO;

/**
 * 订单服务
 * @author 言曌
 * @date 2020/9/15 3:11 下午
 */

public interface OrderService {

    /**
     * 创建订单
     *
     * @param order
     */
    void addOrder(OrderDTO order);
}
