package com.scaler.blogapp.users;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@Entity(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column( nullable = false)
    private Long id;

    @Column( nullable = false)
    @NonNull
    private String username;

    @Column( nullable = false)
    @NonNull
    private String password;

    @Column( nullable = false)
    @NonNull
    private String email;

    @Column(nullable = true)
    @Nullable
    private String bio;

    @Column(nullable = true)
    @Nullable
    private String image;
}
