package ru.netology.autorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.autorizationservice.model.Authorities;
import ru.netology.autorizationservice.model.User;

import java.util.*;

@Repository
public class UserRepository {
    private final Map<String, User> usersMap = new HashMap<>();

    public UserRepository() {
        usersMap.put("admin", new User("admin", "password", new Authorities[]{Authorities.READ, Authorities.WRITE, Authorities.DELETE}));
    }

    public List<Authorities> getUserAuthorities(String userName, String password) {
        User user = usersMap.get(userName);
        if (user != null && user.getPassword().equals(password)) {
            return Arrays.asList(user.getAuthorities());
        }
        return Collections.emptyList();
    }
}
