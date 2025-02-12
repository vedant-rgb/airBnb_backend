package com.project.AirBnbApp.entities;

import com.project.AirBnbApp.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.yaml.snakeyaml.events.Event;

import java.util.Set;

@Entity
@Getter
@Setter
//In postgres we cannot create Table with name User
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
