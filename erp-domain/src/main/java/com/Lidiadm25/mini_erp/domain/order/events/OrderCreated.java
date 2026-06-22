package com.Lidiadm25.mini_erp.domain.order.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.order.OrderId;
import com.Lidiadm25.mini_erp.domain.shared.CustomerId;
import com.Lidiadm25.mini_erp.domain.shared.Money;

import java.time.Instant;

/**
 * Emitted when a new order is created.
 *
 * @param orderId      the order identifier
 * @param customerId   the customer identifier
 * @param customerName the customer name
 * @param totalAmount  the total order amount
 * @param timestamp    the event timestamp
 */
public record OrderCreated(
        OrderId orderId,
        CustomerId customerId,
        String customerName,
        Money totalAmount,
        Instant timestamp
) implements DomainEvent {
}