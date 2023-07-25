package shoppingDemo.dataAccess.abstracts;

import shoppingDemo.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    User getEmail(String email);
    List<User> getAll();
}
