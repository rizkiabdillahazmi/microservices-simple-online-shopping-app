package com.rizkiaazmi.inventoryservice.controller;

import com.rizkiaazmi.inventoryservice.dto.InventoryResponse;
import com.rizkiaazmi.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Rizki Abdillah Azmi on 07-Feb-23
 */
@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    // http://localhost:8082/api/inventory?sku-code=iphone-13&sku-code=iphone-13-red
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
