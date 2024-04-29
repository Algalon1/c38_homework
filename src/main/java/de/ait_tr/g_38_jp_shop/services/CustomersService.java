package de.ait_tr.g_38_jp_shop.services;

import de.ait_tr.g_38_jp_shop.models.Customer;
import liquibase.license.LicenseInfo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


public interface CustomersService {

    Customer save(Customer customer);

    List<Customer> getAll();

    Customer getById(Long id);

    void updateById(Customer customer);

    void deleteById(Long id);

    void deleteById(String name);

    void restoreById(Long id);

    int getAllActive();

    BigDecimal getCartPrice(Long id);

    BigDecimal getAverageCartPrice(Long id);

    void addProductToTheCart(Long[] ids);

    void deleteProductFromTheCart(Long[] ids);

    void clearCart(Long id);
}
