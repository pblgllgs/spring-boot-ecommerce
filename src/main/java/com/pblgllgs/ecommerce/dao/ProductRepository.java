package com.pblgllgs.ecommerce.dao;

import com.pblgllgs.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
