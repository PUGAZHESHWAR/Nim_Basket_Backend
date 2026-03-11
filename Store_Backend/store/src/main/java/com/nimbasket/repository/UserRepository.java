package com.nimbasket.repository;

import com.nimbasket.model.customer.User_Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User_Customer, UUID> {
}