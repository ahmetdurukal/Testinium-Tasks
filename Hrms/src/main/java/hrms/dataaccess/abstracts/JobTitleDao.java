package hrms.dataaccess.abstracts;
import hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    void deleteAll();
}
