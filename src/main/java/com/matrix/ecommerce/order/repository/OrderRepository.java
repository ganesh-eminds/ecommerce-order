package com.matrix.ecommerce.order.repository;

import com.matrix.ecommerce.order.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer> {
}
