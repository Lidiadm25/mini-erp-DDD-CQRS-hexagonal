package persistence.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import persistence.mongo.documents.ProductInCatalogDocument;

public interface ProductInCatalogRepository extends MongoRepository<ProductInCatalogDocument, String> {
}
