package com.leew.jpaex1.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // JPA를 사용하기 위한 Annotation , primary key가 없으면 에러 문구 뜬다.
@Table(name="\"User\"")
public class User {
    @Id // DB에서 Primary Key임을 알려 주는 Annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;
    @NonNull
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
