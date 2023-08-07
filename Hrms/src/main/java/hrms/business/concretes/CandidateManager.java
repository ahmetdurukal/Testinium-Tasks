package hrms.business.concretes;
import hrms.business.abstracts.CandidateService;
import hrms.dataaccess.abstracts.CandidateDao;
import hrms.entities.concretes.Candidate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CandidateManager implements CandidateService {
    private final CandidateDao candidateDao;
    @Override
    public List<Candidate> getAll() {
        return this.candidateDao.findAll();
    }
    @Override
    public Candidate add(Candidate candidate) {
        return this.candidateDao.save(candidate);
    }
    @Override
    public void delete(Candidate candidate) {
        candidateDao.delete(candidate);
    }
    @Override
    public void deleteAll(List<Candidate> candidates) {
        candidateDao.deleteAll();
    }
}
