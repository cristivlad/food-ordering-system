package org.example.domain.ports.output.message.publisher.restaurantapproval;

import org.example.domain.event.OrderPaidEvent;
import org.example.domain.event.publisher.DomainEventPublisher;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
