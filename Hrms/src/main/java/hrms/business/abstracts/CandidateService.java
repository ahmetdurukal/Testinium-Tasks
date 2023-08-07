package hrms.business.abstracts;

import hrms.entities.concretes.Candidate;
import hrms.entities.concretes.Employee;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAll();
    Candidate add(Candidate candidate);
    void delete(Candidate candidate);
    void deleteAll(List<Candidate> candidates);
}
