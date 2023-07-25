package shoppingDemo.business.concretes;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import shoppingDemo.business.abstracts.UserService;
import shoppingDemo.core.abstracts.EmailService;
import shoppingDemo.core.abstracts.RegisterService;
import shoppingDemo.dataAccess.abstracts.UserDao;
import shoppingDemo.entities.concretes.User;

public class UserManager implements UserService {
    private final UserDao userDao;
    private final EmailService emailService;
    private final RegisterService registerService;

    public UserManager(UserDao userDao, EmailService emailService, RegisterService registerService) {
        this.userDao = userDao;
        this.emailService = emailService;
        this.registerService = registerService;
    }

    @Override
    public void register(User user) {
        if(user.getPassword().length()<6){
            System.out.println("Şifre uzunluğunuz 5 haneden fazla olmak zorunda!");
            return;
        }
        final String EMAIL_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.geteMail());

        if (!matcher.matches()) {
            System.out.println("Desteklenmeyen Mail Formatı!");
            return;
        }

        for (User users : userDao.getAll()) {
            if (Objects.equals(users.geteMail(), user.geteMail())) {
                System.out.println("Sisteme kayıtlı e posta");
                return;
            }
        }
        if(user.getName().length()<2 || user.getLastName().length()<2){
            System.out.println("Ad ve soyad en az 2 karakter olmak zoorunda!");
        }
        this.userDao.add(user);
        this.emailService.sendVerifictionEmail();
        if (this.emailService.checkEmail()){
            System.out.println("Erişim başarılı.");
        }else {
            System.out.println("Başarısız erişim.");
        }
    }

    @Override
    public void registerWithGoogle(User user) {
        if (registerService.register(user)) {
            System.out.println("Başarılı google doğrulaması");
        } else {
            System.out.println("Başarısız doğrulama");
        }
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı silindi: "+user.getName());

    }

    @Override
    public void login(User user, String email, String password) {
        if (user.geteMail().equals(email) && user.getPassword().equals(password)) {
            System.out.println("Giriş başarılı: " + user.getName());
        } else {
            System.out.println("İsim veya şifre hatalı!");
        }
    }
}
