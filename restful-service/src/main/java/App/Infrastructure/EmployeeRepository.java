package App.Infrastructure;

import App.Domain.Movie;
import App.Domain.Employee;
import App.Domain.IEmployeeRepository;
import App.Domain.IMovieRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private JdbcTemplate databaseConnection;

    public void setDatabaseConnection(JdbcTemplate databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    @Override
    public Employee create(Employee employee) {
        String sql = "INSERT INTO EMPLOYEE (EmployeeID, FirstName, LastName, Position, PhoneNumber, Address, HourlyPay, FavoriteMovie, StoreID) "
                +
                "VALUES (" + employee.getEmployeeId() + ", '" + employee.getFirstName() + "', '"
                + employee.getLastName() +
                "', '" + employee.getPosition() + "', '" + employee.getPhoneNumber() + "', '" + employee.getAddress() +
                "', " + employee.getHourlyPay() + ", '" + employee.getFavoriteMovie() + "', " + employee.getStoreId()
                + ")";
        this.databaseConnection.execute(sql);
        return employee;
    }

    @Override
    public int update(Employee employee) {
        String sql = "UPDATE EMPLOYEE SET FirstName = '" + employee.getFirstName() + "', LastName = '"
                + employee.getLastName() +
                "', Position = '" + employee.getPosition() + "', PhoneNumber = '" + employee.getPhoneNumber() +
                "', Address = '" + employee.getAddress() + "', HourlyPay = " + employee.getHourlyPay() +
                ", FavoriteMovie = '" + employee.getFavoriteMovie() + "', StoreID = " + employee.getStoreId() +
                " WHERE EmployeeID = " + employee.getEmployeeId();
        int rowsUpdated = this.databaseConnection.update(sql);
        return rowsUpdated;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM EMPLOYEE WHERE EmployeeID = " + id + ";";
        this.databaseConnection.execute(sql);
        return true;
    }

    @Override
    public Employee get(int id) throws Exception {
        String sql = "SELECT * FROM EMPLOYEE WHERE EmployeeID = " + id + ";";
        List<Employee> employees = this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Employee.class));
        if (employees.size() == 1) {
            return employees.get(0);
        }
        throw new Exception();
    }

    @Override
    public List<Employee> get() {
        String sql = "SELECT * FROM EMPLOYEE;";
        List<Employee> employees = this.databaseConnection.query(sql,
                BeanPropertyRowMapper.newInstance(Employee.class));
        return employees;
    }
}
