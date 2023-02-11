package com.rizkiaazmi.orderservice.controller;

import com.rizkiaazmi.orderservice.dto.OrderRequest;
import com.rizkiaazmi.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Rizki Abdillah Azmi on 07-Feb-23
 */
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @CircuitBreaker(name = "inventory", fallbackMethod = "fallbackMethod")
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }

    public String fallbackMethod(OrderRequest orderRequest, RuntimeException runtimeException){
        return "Oops! Something went wrong, please order after some time!";
    }
}
