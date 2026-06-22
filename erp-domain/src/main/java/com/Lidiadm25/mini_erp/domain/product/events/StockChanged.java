package com.Lidiadm25.mini_erp.domain.product.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.product.ProductId;

import java.time.Instant;

public record StockChanged(ProductId productId, Integer oldStock, Integer newStock, String reason, Instant timestamp) implements DomainEvent {
    public StockChanged {
        if (productId == null || oldStock == null || newStock == null || timestamp == null) {
            throw new IllegalArgumentException("Stock changed event fields are required");
        }
        if (oldStock < 0 || newStock < 0) {
            throw new IllegalArgumentException("Stock values cannot be negative");
        }
        if (reason == null || reason.isBlank()) {
            throw new IllegalArgumentException("Stock change reason is required");
        }
    }
}
