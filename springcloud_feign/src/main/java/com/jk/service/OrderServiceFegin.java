package com.jk.service;


import com.jk.OrderService.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.Map;

@FeignClient("service-order")//声明为feig客户端 指明要调用的服务
public interface OrderServiceFegin extends OrderService {

}
