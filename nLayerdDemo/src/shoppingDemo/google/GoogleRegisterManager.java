package shoppingDemo.google;

import shoppingDemo.entities.concretes.User;

public class GoogleRegisterManager {
    public void register(User user){
        System.out.println(user.getName()+" "+user.geteMail());
    }
}
