package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}