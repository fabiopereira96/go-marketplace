package br.com.go.marketplace.services;

import br.com.go.marketplace.entities.Category;
import br.com.go.marketplace.entities.Product;
import br.com.go.marketplace.repositories.ProductRepository;
import br.com.go.marketplace.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product find(Integer id){
        Optional<Product> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! Id: " + id +", Tipo: " + Product.class.getName()));
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public List<Product> findByCategory(Category category){
        return repository.findProductByCategory(category);
    }

}
