package shoppingDemo.core.concretes;

import shoppingDemo.core.abstracts.EmailService;

public class EmailManager implements EmailService {
    @Override
    public void sendVerifictionEmail() {
        System.out.println("Doğrulama postası gönderildi.");
    }

    @Override
    public boolean checkEmail() {
        return true;
    }
}
