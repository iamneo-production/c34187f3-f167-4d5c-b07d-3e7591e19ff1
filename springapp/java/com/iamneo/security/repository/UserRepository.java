package com.iamneo.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.User;

import ch.qos.logback.core.model.Model;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByvehicleNumber(String vehicleNumber);

//	Optional<User> findById(String vehicleNumber);

}

