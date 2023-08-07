package hrms.business.concretes;
import hrms.business.abstracts.JobTitleService;
import hrms.dataaccess.abstracts.JobTitleDao;
import hrms.entities.concretes.JobTitle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class JobTitleManager implements JobTitleService {
    private final JobTitleDao jobTitleDao;
    @Override
    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }
    @Override
    public JobTitle add(JobTitle jobTitle) {
        return jobTitleDao.save(jobTitle);
    }
    @Override
    public void delete(JobTitle jobTitle) {
        jobTitleDao.delete(jobTitle);
    }
    @Override
    public void deleteAll(List<JobTitle> jobTitles) {
        jobTitleDao.deleteAll();
    }
}
