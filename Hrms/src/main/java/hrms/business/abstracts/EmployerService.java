package hrms.business.abstracts;

import hrms.entities.concretes.Employer;


import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
    Employer add(Employer employer);
    void delete(Employer employer);
    void deleteAll(List<Employer> employers);
}
