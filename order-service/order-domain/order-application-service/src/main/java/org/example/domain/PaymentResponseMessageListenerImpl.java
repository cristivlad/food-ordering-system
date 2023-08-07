package org.example.domain;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.dto.message.PaymentResponse;
import org.example.domain.ports.input.message.listener.payment.PaymentResponseMessageListener;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@Slf4j
public class PaymentResponseMessageListenerImpl implements PaymentResponseMessageListener {
    @Override
    public void paymentCompleted(PaymentResponse paymentResponse) {

    }

    @Override
    public void paymentCancelled(PaymentResponse paymentResponse) {

    }
}
