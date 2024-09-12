package ru.sala.is2.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.sala.is2.entity.User;
import ru.sala.is2.repository.UserRepository;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity<?> createUser(User user) {
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<?> findUser(String login, String password) {
        User user = userRepository.findByLoginLikeAndPasswordLike(login, password);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

}
