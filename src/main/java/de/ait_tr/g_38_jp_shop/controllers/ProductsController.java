package de.ait_tr.g_38_jp_shop.controllers;

import de.ait_tr.g_38_jp_shop.models.Product;
import de.ait_tr.g_38_jp_shop.services.ProductsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductsService service;

    public ProductsController(ProductsService service) {
        this.service = service;
    }


    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return service.save(product);
    }
}
