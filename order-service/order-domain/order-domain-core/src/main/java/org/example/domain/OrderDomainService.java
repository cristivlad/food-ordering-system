package org.example.domain;

import org.example.domain.entity.Order;
import org.example.domain.entity.Restaurant;
import org.example.domain.event.OrderCancelledEvent;
import org.example.domain.event.OrderCreatedEvent;
import org.example.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);
    OrderPaidEvent payOrder(Order order);
    void approveOrder(Order order);
    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);
    void cancelOrder(Order order, List<String> failureMessages);
}
