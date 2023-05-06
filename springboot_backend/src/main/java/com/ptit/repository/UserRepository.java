package com.ptit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ptit.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
}
