package hrms.apicontroller;

import hrms.business.abstracts.CandidateService;

import hrms.entities.concretes.Candidate;
import hrms.entities.concretes.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Candidates")
@RequiredArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;
    @GetMapping("/getall")
    public List<Candidate> getAll(){
        return candidateService.getAll();
    }
    @PostMapping("/add")
    public Candidate add(@RequestBody Candidate candidate) {
        return candidateService.add(candidate);
    }
    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Candidate candidate){
        candidateService.delete(candidate);
    }
    @DeleteMapping(value = "/deleteall")
    public void deleteAll(@RequestBody List<Candidate> candidates) {
        candidateService.deleteAll(candidates);
    }
}
