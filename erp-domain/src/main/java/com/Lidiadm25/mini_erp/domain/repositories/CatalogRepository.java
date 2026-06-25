package com.Lidiadm25.mini_erp.domain.repositories;
/*
* Port read-only for Catalog
* */

import com.Lidiadm25.mini_erp.domain.catalog.Catalog;
import com.Lidiadm25.mini_erp.domain.catalog.CatalogItem;
import com.Lidiadm25.mini_erp.domain.catalog.CatalogType;

import java.util.List;
import java.util.Optional;

public interface CatalogRepository {

    Optional<Catalog> findById(CatalogType type);

    List<CatalogItem> findItemsByType(CatalogType type);

    Optional<CatalogItem> findItemByTypeAndCode(String code, CatalogType type);

}
