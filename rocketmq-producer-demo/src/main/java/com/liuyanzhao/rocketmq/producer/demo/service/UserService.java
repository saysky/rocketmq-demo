package com.liuyanzhao.rocketmq.producer.demo.service;

import com.liuyanzhao.rocketmq.producer.demo.dto.UserDTO;

/**
 * @author 言曌
 * @date 2020/9/15 3:11 下午
 */

public interface UserService {

    /**
     * 添加用户
     *
     * @param user
     */
    void addUser(UserDTO user);
}
