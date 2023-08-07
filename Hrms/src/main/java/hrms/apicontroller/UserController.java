package hrms.apicontroller;
import hrms.business.abstracts.UserService;
import hrms.dto.UserCreateRequest;
import hrms.dto.UserCreateResponse;
import hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }
    @PostMapping("/add")
    public UserCreateResponse add(@RequestBody UserCreateRequest request) {
        return userService.add(request);
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") int id) {
        return userService.delete(id);
    }
    @DeleteMapping(value = "/deleteall")
    public void deleteAll(@RequestBody List<User> users) {
        userService.deleteAll(users);
    }
}
