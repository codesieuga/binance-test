package vn.com.kyber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import vn.com.kyber.service.OrderService;

@Controller()
public class OrderController {
    final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(value = "order-book")
    public @ResponseBody String getOrderBook(@RequestParam("symbol") String symbol){
        String resp = orderService.getOrderBook(symbol);
        return resp;
    }
}
