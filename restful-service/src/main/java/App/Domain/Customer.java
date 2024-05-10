package App.Domain;

public class Customer {

    private int customerid;
    private String name;
    private String phonenumber;
    private String address;

    public int getCustomerId() {
        return this.customerid;
    }

    public void setCustomerId(int customerId) {
        this.customerid = customerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
}