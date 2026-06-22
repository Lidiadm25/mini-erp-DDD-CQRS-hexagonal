package com.Lidiadm25.mini_erp.domain.product.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.product.ProductId;

import java.time.Instant;

public record ProductUpdated(ProductId productId, Instant timestamp) implements DomainEvent {
    public ProductUpdated {
        if (productId == null || timestamp == null) {
            throw new IllegalArgumentException("Product updated event fields are required");
        }
    }
}
