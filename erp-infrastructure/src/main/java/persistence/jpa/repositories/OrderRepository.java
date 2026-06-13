package persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import persistence.jpa.entities.OrderEntity;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
}
