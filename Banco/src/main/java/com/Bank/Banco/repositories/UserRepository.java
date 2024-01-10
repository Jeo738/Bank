package com.Bank.Banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.Banco.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
