package br.com.go.marketplace.repositories;

import br.com.go.marketplace.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
