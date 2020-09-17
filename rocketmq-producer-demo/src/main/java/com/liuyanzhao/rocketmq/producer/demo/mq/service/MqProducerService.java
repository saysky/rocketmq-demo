package com.liuyanzhao.rocketmq.producer.demo.mq.service;

import com.liuyanzhao.rocketmq.producer.demo.dto.MqMessageDTO;

/**
 * MQ生产者发送消息服务
 *
 * @author 言曌
 * @date 2020/9/14 8:21 下午
 */
public interface MqProducerService {

    /**
     * 发送消息
     *
     * @param mqMessageDTO
     * @return
     */
    boolean sendMessage(MqMessageDTO mqMessageDTO);
}
