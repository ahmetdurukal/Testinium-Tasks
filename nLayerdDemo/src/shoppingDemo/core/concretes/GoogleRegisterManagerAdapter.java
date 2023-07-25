package shoppingDemo.core.concretes;

import shoppingDemo.core.abstracts.RegisterService;
import shoppingDemo.entities.concretes.User;
import shoppingDemo.google.GoogleRegisterManager;


public class GoogleRegisterManagerAdapter implements RegisterService {
    @Override
    public boolean register(User user) {
        GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
        googleRegisterManager.register(user);
        return true;

    }
}
