package com.Lidiadm25.mini_erp.domain.customer;

import java.util.Optional;

/*
* Port for external service
* */
public interface CustomerProvider {
    Optional<CustomerInfo> findById(Long id);
    boolean existsById(Long id);
}
