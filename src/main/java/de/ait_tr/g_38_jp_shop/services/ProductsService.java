package de.ait_tr.g_38_jp_shop.services;


import de.ait_tr.g_38_jp_shop.models.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductsService {
    Product save(Product product);

    List<Product> getAll();

    Product getById(Long id);

    void update(Product product);

    void deleteById(Long id);

    void deleteByTitle(String title);

    void restoreById(Long id);

    int getTotalQuantity();

    BigDecimal getTotalSum();

    BigDecimal getAveragePrice();
}
