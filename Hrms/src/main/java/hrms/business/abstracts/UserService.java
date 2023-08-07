package hrms.business.abstracts;
import hrms.dto.UserCreateRequest;
import hrms.dto.UserCreateResponse;
import hrms.entities.concretes.User;
import java.util.List;
public interface UserService {
    List<User>getAll();
    UserCreateResponse add(UserCreateRequest request);
    String delete(int id);
    void deleteAll(List<User> users);
}
