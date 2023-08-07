package hrms.business.concretes;
import hrms.business.abstracts.UserService;
import hrms.dataaccess.abstracts.UserDao;
import hrms.dto.UserCreateRequest;
import hrms.dto.UserCreateResponse;
import hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserManager implements UserService {

    private final UserDao userDao;
    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
    @Override
    public UserCreateResponse add(UserCreateRequest request) {
        User user = new User();
        user.setDtype("User");
        user.setEmail(request.getEmail());
        user.setCompanyName(request.getCompanyName());
        user.setPassword(request.getPassword());
        user.setWebAddress(request.getWebAddress());

        userDao.save(user);

        return UserCreateResponse
                .builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
    @Override
    public String delete(int id) {
        userDao.deleteById(id);
        return id + " 'id'li user silindi.";
    }
    @Override
    public void deleteAll(List<User> users) {
        userDao.deleteAll(users);
    }
}
