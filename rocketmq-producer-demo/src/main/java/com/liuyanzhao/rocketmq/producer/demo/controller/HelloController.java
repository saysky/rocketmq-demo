package com.liuyanzhao.rocketmq.producer.demo.controller;

import com.liuyanzhao.rocketmq.producer.demo.dto.OrderDTO;
import com.liuyanzhao.rocketmq.producer.demo.dto.UserDTO;
import com.liuyanzhao.rocketmq.producer.demo.service.OrderService;
import com.liuyanzhao.rocketmq.producer.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * 测试发生消息控制器
 *
 * @author 言曌
 * @date 2020/9/14 8:47 下午
 */
@RestController
public class HelloController {


    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/testAddUser")
    public String testAddUser() {
        // 模拟发送数据
        UserDTO user = new UserDTO(UUID.randomUUID().toString().replace("-", ""), "张三", "123456");
        userService.addUser(user);
        return "success";
    }

    @GetMapping("/testAddOrder")
    public String testAddOrder() {
        // 模拟发送数据
        OrderDTO orderDTO = new OrderDTO(UUID.randomUUID().toString().replace("-", ""), "1", "1", new Date());
        orderService.addOrder(orderDTO);
        return "success";
    }


}


