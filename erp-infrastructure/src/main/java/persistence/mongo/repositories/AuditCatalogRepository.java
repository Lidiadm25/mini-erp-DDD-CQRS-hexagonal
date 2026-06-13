package persistence.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AuditCatalogRepository extends MongoRepository<AuditCatalogRepository, UUID> {
}
