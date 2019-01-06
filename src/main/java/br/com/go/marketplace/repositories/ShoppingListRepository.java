package br.com.go.marketplace.repositories;

import br.com.go.marketplace.entities.ShoppingList;
import br.com.go.marketplace.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Integer> {

    List<ShoppingList> findAllByUser(User user);
}
