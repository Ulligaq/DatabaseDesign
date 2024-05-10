package App.Application.Controllers;

import App.Domain.Customer;
import App.Infrastructure.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private JdbcTemplate databaseConnection;

    private CustomerRepository customerRepository;

    public CustomerController() {
        this.customerRepository = new CustomerRepository();
    }

    @PostMapping("/")
    public int post(@RequestBody() Customer customercreate) {
        this.customerRepository.setDatabaseConnection(this.databaseConnection);
        this.customerRepository.create(customercreate);
        return customercreate.getCustomerId();

    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int id, @RequestBody() Customer customer) {
        this.customerRepository.setDatabaseConnection(this.databaseConnection);
        this.customerRepository.update(id, customer);
    }

    @GetMapping("/{id}")
    public Customer get(@PathVariable("id") int id) throws Exception {
        this.customerRepository.setDatabaseConnection(this.databaseConnection);
        return this.customerRepository.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        this.customerRepository.setDatabaseConnection(this.databaseConnection);
        this.customerRepository.delete(id);
    }

    @GetMapping("/")
    public List<Customer> get() {
        this.customerRepository.setDatabaseConnection(this.databaseConnection);
        return this.customerRepository.get();
    }
}
