package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void saveUser(User user);
    User findById(long id);
    void updateUser(User user);
}
