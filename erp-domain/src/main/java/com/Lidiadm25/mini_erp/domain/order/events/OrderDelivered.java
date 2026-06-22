package com.Lidiadm25.mini_erp.domain.order.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.order.OrderId;

import java.time.Instant;

/**
 * Emitted when order transitions SHIPPED -> DELIVERED.
 * Final state.
 *
 * @param orderId   the order identifier
 * @param timestamp the event timestamp
 */
public record OrderDelivered(
        OrderId orderId,
        Instant timestamp
) implements DomainEvent {
}