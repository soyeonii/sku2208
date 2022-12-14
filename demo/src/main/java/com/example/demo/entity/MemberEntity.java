package com.example.demo.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "member")
@Table(name = "member")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class MemberEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userId;
    private String name;
    private String password;
    private String email;
    @Column(name = "join_date")
    @CreationTimestamp
    private LocalDateTime joinDate;

    public MemberEntity(String userId, String name, String password, String email) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
