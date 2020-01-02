package com.example.springsecurityjpa.repository;

import com.example.springsecurityjpa.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

   Optional<User> findByUsername(String userName);
}
