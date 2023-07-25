package shoppingDemo;

import shoppingDemo.business.abstracts.UserService;
import shoppingDemo.business.concretes.UserManager;
import shoppingDemo.core.concretes.EmailManager;
import shoppingDemo.core.concretes.GoogleRegisterManagerAdapter;
import shoppingDemo.dataAccess.concretes.InMemoryUser;
import shoppingDemo.entities.concretes.User;
import shoppingDemo.google.GoogleRegisterManager;
public class ShoppingMain {
    public static void main(String[] args) {
        UserService userService = new UserManager(new InMemoryUser(), new EmailManager(),
                new GoogleRegisterManagerAdapter());

        User user1 = new User(1, "Ahmet", "Durukal", "durukalahmet@gmail.com", "123456");
        userService.register(user1);
        System.out.println();
        userService.registerWithGoogle(user1);
        System.out.println();
        userService.login(user1, "durukalahmet@gmail.com", "123456");
    }
}
