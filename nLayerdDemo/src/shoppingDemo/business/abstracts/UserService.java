package shoppingDemo.business.abstracts;

import shoppingDemo.entities.concretes.User;

public interface UserService {
    void register(User user);
    void registerWithGoogle(User user);
    void delete(User user);
    void login(User user,String email,String password);
}
