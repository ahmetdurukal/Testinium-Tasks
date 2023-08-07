package hrms.apicontroller;

import hrms.business.abstracts.EmployeeService;

import hrms.entities.concretes.Employee;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;
    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }
    @DeleteMapping(value = "/delete")
    public void delete(@RequestBody Employee employee){
        employeeService.delete(employee);
    }
    @DeleteMapping(value = "/deleteall")
    public void deleteAll(@RequestBody List<Employee> employees) {
        employeeService.deleteAll(employees);
    }
}
