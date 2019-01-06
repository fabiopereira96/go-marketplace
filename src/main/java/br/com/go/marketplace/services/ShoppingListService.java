package br.com.go.marketplace.services;

import br.com.go.marketplace.entities.ShoppingList;
import br.com.go.marketplace.entities.User;
import br.com.go.marketplace.repositories.ShoppingListRepository;
import br.com.go.marketplace.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingListService {

    @Autowired
    private ShoppingListRepository repository;

    public ShoppingList find(Integer id){
        Optional<ShoppingList> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! Id: " + id +", Tipo: " + ShoppingList.class.getName()));
    }

    public List<ShoppingList> findAllByUser(User user){
        return repository.findAllByUser(user);
    }
}
