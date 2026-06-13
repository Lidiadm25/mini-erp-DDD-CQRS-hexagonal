package persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import persistence.jpa.entities.OrderProductEntity;

import java.util.UUID;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity, UUID> {
}
