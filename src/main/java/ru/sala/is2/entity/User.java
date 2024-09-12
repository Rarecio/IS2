package ru.sala.is2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "surname", nullable = false, length = Integer.MAX_VALUE)
    private String surname;

    @Column(name = "login", nullable = false, unique = true, length = Integer.MAX_VALUE)
    private String login;

    @Column(name = "password", nullable = false, length = Integer.MAX_VALUE)
    private String password;

}