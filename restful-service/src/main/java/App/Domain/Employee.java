package App.Domain;

public class Employee {

    private int employeeid;

    private String firstname;

    private String lastname;

    private String position;

    private String phonenumber;

    private String address;

    private float hourlypay;

    private String favoritemovie;

    private int storeid;

    public int getEmployeeId() {
        return this.employeeid;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeid = employeeId;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return this.lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return this.phonenumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phonenumber = phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getHourlyPay() {
        return this.hourlypay;
    }

    public void setHourlyPay(float hourlyPay) {
        this.hourlypay = hourlyPay;
    }

    public String getFavoriteMovie() {
        return this.favoritemovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoritemovie = favoriteMovie;
    }

    public int getStoreId() {
        return this.storeid;
    }

    public void setStoreId(int storeId) {
        this.storeid = storeId;
    }
}