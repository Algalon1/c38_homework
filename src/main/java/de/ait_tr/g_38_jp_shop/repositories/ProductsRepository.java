package de.ait_tr.g_38_jp_shop.repositories;

import de.ait_tr.g_38_jp_shop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
}
