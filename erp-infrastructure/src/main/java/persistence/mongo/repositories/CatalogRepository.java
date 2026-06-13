package persistence.mongo.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import persistence.mongo.documents.CatalogDocument;

public interface CatalogRepository extends MongoRepository<CatalogDocument, String> {
}
