package com.Lidiadm25.mini_erp.domain.order.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.order.OrderId;

import java.time.Instant;

public record OrderConfirmed(
        OrderId orderId,
        Instant timestamp
) implements DomainEvent {
}
