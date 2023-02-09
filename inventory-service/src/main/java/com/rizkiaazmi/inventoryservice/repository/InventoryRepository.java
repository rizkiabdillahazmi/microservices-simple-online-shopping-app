package com.rizkiaazmi.inventoryservice.repository;

import com.rizkiaazmi.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Rizki Abdillah Azmi on 07-Feb-23
 */
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
