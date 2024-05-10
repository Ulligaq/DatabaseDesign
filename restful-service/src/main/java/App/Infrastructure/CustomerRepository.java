package App.Infrastructure;

import App.Domain.Customer;
import App.Domain.ICustomerRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    private JdbcTemplate databaseConnection;

    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public Movie create(Customer customer) {
        String sql = "INSERT INTO Customer_(CustomerID, Name, PhoneNumber, Address) VALUES ("
                + customer.getCustomerId() + ", '"
                + customer.getName() + "', " + customer.getPhoneNumber() + ", '" + customer.getAddress() + "');";
        this.databaseConnection.execute(sql);
        return customer;
    }

    @Override
    public int update(Customer customer) {
        String sql = "UPDATE Customer_ SET CustomerID = " + customer.getCustomerId() + ", Name = '"
                + customer.Name()
                + "', PhoneNumber = "
                + customer.getPhoneNumber() + ", Address = '" + customer.getAddress() + "' WHERE CustomerID = "
                + customer.getCustomerId() + ");";
        int rows = this.databaseConnection.update(sql);
        return rows;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM Customer_ WHERE CustomerID = " + id + ";";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public Customer get(int id) throws Exception {
        String sql = "SELECT * FROM Customer_ WHERE CustomerID = " + id + ";";
        List<Customer> customers = this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Customer.class));
        if (customers.size() == 1) {
            return customers.get(0);
        }
        throw new Exception();
    }

    @Override
    public List<Customer> get() {
        String sql = "SELECT * FROM kh184217.Customer_;";
        List<Customer> customers = this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Customer.class));
        return customers;
    }
}
