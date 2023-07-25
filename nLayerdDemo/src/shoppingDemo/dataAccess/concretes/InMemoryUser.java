package shoppingDemo.dataAccess.concretes;

import shoppingDemo.dataAccess.abstracts.UserDao;
import shoppingDemo.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUser implements UserDao {
    List<User> users = new ArrayList<User>();
    @Override
    public void add(User user) {
        System.out.println("User added: "+user.getName());
        users.add(user);
    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted: "+user.getName());
        users.remove(user);

    }

    @Override
    public void update(User user) {
        System.out.println("User UPDATED: "+user.getName());


    }

    @Override
    public User getEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }
}
