package hrms.business.abstracts;
import hrms.entities.concretes.JobTitle;
import java.util.List;
public interface JobTitleService {
    List<JobTitle>getAll();
    JobTitle add(JobTitle jobTitle);
    void delete(JobTitle jobTitle);
    void deleteAll(List<JobTitle> jobTitles);
}
