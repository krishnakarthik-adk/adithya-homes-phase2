package com.adithyahomesp2.expensetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adithyahomesp2.expensetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
