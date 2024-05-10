package App.Application.Controllers;

import App.Domain.Employee;
import App.Infrastructure.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private EmployeeRepository employeeRepository;

    public EmployeeController() {
        this.employeeRepository = new EmployeeRepository();
    }

    @PostMapping("/")
    public int post(@RequestBody() Employee employeecreate) {
        this.employeeRepository.setDatabaseConnection(this.databaseConnection);
        this.employeeRepository.create(employeecreate);
        return employeecreate.getEmployeeId();

    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody() Employee employee) {
        this.employeeRepository.setDatabaseConnection(this.databaseConnection);
        this.employeeRepository.update(id, employee);
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable("id") int id) throws Exception {
        this.employeeRepository.setDatabaseConnection(this.databaseConnection);
        return this.employeeRepository.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        this.employeeRepository.setDatabaseConnection(this.databaseConnection);
        this.employeeRepository.delete(id);
    }

    @GetMapping("/")
    public List<Employee> get() {
        this.employeeRepository.setDatabaseConnection(this.databaseConnection);
        return this.employeeRepository.get();
    }
}
