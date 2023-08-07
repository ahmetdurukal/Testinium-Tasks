package hrms.business.concretes;

import hrms.business.abstracts.EmployerService;
import hrms.dataaccess.abstracts.EmployerDao;
import hrms.entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EmployerManager implements EmployerService {
    private final EmployerDao employerDao;

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }

    @Override
    public Employer add(Employer employer) {
        return this.employerDao.save(employer);
    }

    @Override
    public void delete(Employer employer) {
        employerDao.delete(employer);
    }

    @Override
    public void deleteAll(List<Employer> employers) {
        employerDao.deleteAll();
    }
}
