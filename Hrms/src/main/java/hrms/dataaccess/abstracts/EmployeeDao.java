package hrms.dataaccess.abstracts;

import hrms.entities.concretes.Employee;
import hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
