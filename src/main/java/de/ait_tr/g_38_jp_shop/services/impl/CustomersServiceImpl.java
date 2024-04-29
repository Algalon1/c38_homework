package de.ait_tr.g_38_jp_shop.services.impl;

import de.ait_tr.g_38_jp_shop.models.Customer;
import de.ait_tr.g_38_jp_shop.repositories.CustomersRepository;
import de.ait_tr.g_38_jp_shop.services.CustomersService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {

    private CustomersRepository repository;

    public CustomersServiceImpl(CustomersRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer getById(Long id) {
        if(id == null || id < 1){
            throw new RuntimeException("Customer id is incorrect");
        }

        Customer customer = repository.findById(id).orElse(null);

        if (customer == null){
            throw new RuntimeException("Customer not found");
        }
        return customer;
    }

    @Override
    public void updateById(Customer customer) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteById(String name) {

    }

    @Override
    public void restoreById(Long id) {

    }

    @Override
    public int getAllActive() {
        return 0;
    }

    @Override
    public BigDecimal getCartPrice(Long id) {
        return null;
    }

    @Override
    public BigDecimal getAverageCartPrice(Long id) {
        return null;
    }

    @Override
    public void addProductToTheCart(Long[] ids) {

    }

    @Override
    public void deleteProductFromTheCart(Long[] ids) {

    }

    @Override
    public void clearCart(Long id) {

    }
}
