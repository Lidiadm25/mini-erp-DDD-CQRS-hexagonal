package com.Lidiadm25.mini_erp.domain.product.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.product.ProductId;

import java.time.Instant;

public record ProductDeactivated(ProductId productId, Instant timestamp) implements DomainEvent {
    public ProductDeactivated {
        if (productId == null || timestamp == null) {
            throw new IllegalArgumentException("Product deactivated event fields are required");
        }
    }
}
