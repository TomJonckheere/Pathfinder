package be.test.pivot;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
        this(null, null, null, null);
    }

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}