package de.ait_tr.g_38_jp_shop.repositories;

import de.ait_tr.g_38_jp_shop.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customer, Long> {
}
