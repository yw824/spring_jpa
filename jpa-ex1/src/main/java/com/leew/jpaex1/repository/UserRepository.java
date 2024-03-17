package com.leew.jpaex1.repository;

import com.leew.jpaex1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // User : Entity가 될 DTO 클래스
    // Long : 해당 Entity의 primary key의 자료형
}
