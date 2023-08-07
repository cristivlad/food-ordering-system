package org.example.domain.ports.input.service;

import jakarta.validation.Valid;
import org.example.domain.dto.create.CreateOrderCommand;
import org.example.domain.dto.create.CreateOrderResponse;
import org.example.domain.dto.track.TrackOrderQuery;
import org.example.domain.dto.track.TrackOrderResponse;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
