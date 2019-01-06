package br.com.go.marketplace.repositories;

import br.com.go.marketplace.entities.Category;
import br.com.go.marketplace.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductByCategory(Category category);
}
