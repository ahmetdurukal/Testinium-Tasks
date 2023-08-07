package hrms.apicontroller;

import hrms.business.abstracts.EmployerService;
import hrms.business.abstracts.JobTitleService;
import hrms.entities.concretes.Employer;
import hrms.entities.concretes.JobTitle;
import hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/api/Employers")
    @RequiredArgsConstructor
    public class EmployerController {
        private final EmployerService employerService;
        @GetMapping("/getall")
        public List<Employer> getAll(Employer employer){
            return employerService.getAll();
        }
        @PostMapping("/add")
        public Employer add(@RequestBody Employer employer) {
            return employerService.add(employer);
        }
        @DeleteMapping(value = "/delete")
        public void delete(@RequestBody Employer employer){
            employerService.delete(employer);
        }
        @DeleteMapping(value = "/deleteall")
        public void deleteAll(@RequestBody List<Employer> employers) {
            employerService.deleteAll(employers);
        }
}
