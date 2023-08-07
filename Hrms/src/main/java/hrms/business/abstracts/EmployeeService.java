package hrms.business.abstracts;

import hrms.entities.concretes.Employee;
import hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
    Employee add(Employee employee);
    void delete(Employee employee);
    void deleteAll(List<Employee> employees);
}
