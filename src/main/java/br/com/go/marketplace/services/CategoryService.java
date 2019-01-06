package br.com.go.marketplace.services;

import br.com.go.marketplace.entities.Category;
import br.com.go.marketplace.repositories.CategoryRepository;
import br.com.go.marketplace.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category find(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! Id: " + id +", Tipo: " + Category.class.getName()));
    }

    public List<Category> findAll(){
        return repository.findAll();
    }
}
