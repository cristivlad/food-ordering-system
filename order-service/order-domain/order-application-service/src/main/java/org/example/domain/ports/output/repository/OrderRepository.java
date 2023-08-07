package org.example.domain.ports.output.repository;

import org.example.domain.entity.Order;
import org.example.domain.valuobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
