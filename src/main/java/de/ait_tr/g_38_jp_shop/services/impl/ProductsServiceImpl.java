package de.ait_tr.g_38_jp_shop.services.impl;

import de.ait_tr.g_38_jp_shop.models.Product;
import de.ait_tr.g_38_jp_shop.repositories.ProductsRepository;
import de.ait_tr.g_38_jp_shop.services.ProductsService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    private ProductsRepository repository;

    public ProductsServiceImpl(ProductsRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(Long id) {

        if(id == null || id < 1){
            throw new RuntimeException("Product id is incorrect");
        }

        Product product =repository.findById(id).orElse(null);

        if (product == null){
            throw new RuntimeException("Product not found");
        }
        return product;
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByTitle(String title) {

    }

    @Override
    public void restoreById(Long id) {

    }

    @Override
    public int getTotalQuantity() {
        return 0;
    }

    @Override
    public BigDecimal getTotalSum() {
        return null;
    }

    @Override
    public BigDecimal getAveragePrice() {
        return null;
    }
}
