package com.iamneo.security.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Model;
import com.iamneo.security.entity.User;

public interface Demorep extends JpaRepository<Model, String> {
	Optional<Model> findById(String id);

}
