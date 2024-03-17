package com.leew.jpaex1.repository;

import com.leew.jpaex1.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository; // 같은 디렉토리 구조 내에 있어야 autowired되어 에러 없어진다.

    @Test
    void crud() {
        userRepository.save(new User());

        System.out.println(">>> " + userRepository.findAll()); // userRepository의 모든 데이터 가져오기
    }
}