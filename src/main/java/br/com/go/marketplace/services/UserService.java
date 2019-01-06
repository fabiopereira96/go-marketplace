package br.com.go.marketplace.services;

import br.com.go.marketplace.entities.User;
import br.com.go.marketplace.repositories.UserRepository;
import br.com.go.marketplace.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User find(Integer id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! Id: " + id +", Tipo: " + User.class.getName()));
    }
}
