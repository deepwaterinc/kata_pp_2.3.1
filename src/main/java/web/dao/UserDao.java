package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void saveUser(User user);
    User findById(long id);
    void updateUser(User user);
}
