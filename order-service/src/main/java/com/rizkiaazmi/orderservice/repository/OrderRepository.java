package com.rizkiaazmi.orderservice.repository;

import com.rizkiaazmi.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rizki Abdillah Azmi on 07-Feb-23
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
