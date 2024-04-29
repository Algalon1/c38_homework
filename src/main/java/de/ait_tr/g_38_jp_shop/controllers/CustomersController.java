package de.ait_tr.g_38_jp_shop.controllers;

import de.ait_tr.g_38_jp_shop.models.Customer;
import de.ait_tr.g_38_jp_shop.services.CustomersService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    CustomersService service;

    public CustomersController(CustomersService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return service.save(customer);
    }
}
