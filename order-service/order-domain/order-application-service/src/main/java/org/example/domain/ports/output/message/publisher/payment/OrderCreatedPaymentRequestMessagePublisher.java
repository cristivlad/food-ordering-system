package org.example.domain.ports.output.message.publisher.payment;

import org.example.domain.event.OrderCreatedEvent;
import org.example.domain.event.publisher.DomainEventPublisher;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {

}
