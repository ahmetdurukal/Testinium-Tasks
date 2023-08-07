package hrms.business.concretes;

import hrms.business.abstracts.EmployeeService;
import hrms.dataaccess.abstracts.EmployeeDao;
import hrms.entities.concretes.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeManager implements EmployeeService {
    private final EmployeeDao employeeDao;

    @Override
    public List<Employee> getAll() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }

    @Override
    public void deleteAll(List<Employee> employees) {
        employeeDao.deleteAll();
    }
}
