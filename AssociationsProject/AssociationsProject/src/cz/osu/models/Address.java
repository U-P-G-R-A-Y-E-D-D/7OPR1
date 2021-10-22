package cz.osu.models;

public class Address {
    private String city;
    private String street;
    private int houseNumber;
    private State state;

    public Address(String city, String street, int houseNumber, State state) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.state = state;
    }

    public Address(Address address) {
        this.city = address.city;
        this.street = address.street;
        this.houseNumber = address.houseNumber;
        this.state = new State(address.state);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Stát %s, město: %s, ulice: %s, číslo domu: %d", state, city, street, houseNumber);
    }
}
