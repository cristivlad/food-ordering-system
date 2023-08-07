package org.example.domain.ports.output.message.publisher.payment;

import org.example.domain.event.OrderCancelledEvent;
import org.example.domain.event.publisher.DomainEventPublisher;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
