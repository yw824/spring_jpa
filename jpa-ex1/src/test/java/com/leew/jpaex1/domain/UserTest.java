package com.leew.jpaex1.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setId(null); // id 값은 자동 생성이므로, null로 생성하면 됨
        user.setEmail("leew@gmail.com");
        user.setName("Leew");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        System.out.println(">>> " + user.toString());

        User user1 = User.builder().id(null).name("user1").email("user1@gmail.com")
                .createdAt(LocalDateTime.now()).updatedAt(LocalDateTime.now()).build();

        System.out.println(">>> " + user1.toString());
    }

}