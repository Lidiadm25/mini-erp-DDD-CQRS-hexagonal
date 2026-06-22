package com.Lidiadm25.mini_erp.domain.product.events;

import com.Lidiadm25.mini_erp.domain.common.DomainEvent;
import com.Lidiadm25.mini_erp.domain.product.ProductId;
import com.Lidiadm25.mini_erp.domain.product.ProductName;
import com.Lidiadm25.mini_erp.domain.product.SKU;
import com.Lidiadm25.mini_erp.domain.shared.Money;

import java.time.Instant;

public record ProductCreated(ProductId productId, SKU sku, ProductName name, Money price, Instant timestamp) implements DomainEvent {
    public ProductCreated {
        if (productId == null || sku == null || name == null || price == null || timestamp == null) {
            throw new IllegalArgumentException("Product created event fields are required");
        }
    }
}
