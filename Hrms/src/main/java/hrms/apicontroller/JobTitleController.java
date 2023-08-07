package hrms.apicontroller;
import hrms.business.abstracts.JobTitleService;
import hrms.entities.concretes.JobTitle;
import hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/jobtitles")
@RequiredArgsConstructor
public class JobTitleController {
    private final JobTitleService jobTitleService;
    @GetMapping("/getall")
    public List<JobTitle>getAll(User user){
        return jobTitleService.getAll();
    }
    @PostMapping("/add")
    public JobTitle add(@RequestBody JobTitle jobTitle) {
        return jobTitleService.add(jobTitle);
    }
    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody JobTitle jobTitle){
        jobTitleService.delete(jobTitle);
    }
    @DeleteMapping(value = "/deleteall")
    public void deleteAll(@RequestBody List<JobTitle> jobTitles) {
        jobTitleService.deleteAll(jobTitles);
    }
}
