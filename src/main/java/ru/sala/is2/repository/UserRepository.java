package ru.sala.is2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sala.is2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLoginLike(String login);

    User findByLoginLikeAndPasswordLike(String login, String password);
}