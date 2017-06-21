package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private double price;
    private String address,state,city,description,
            rules,wifi,cable,bathroom,rented="not rented";
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getRules() {return rules;}
    public void setRules(String rules) {this.rules = rules;}
    public String getWifi() {return wifi;}
    public void setWifi(String wifi) {this.wifi = wifi;}
    public String getCable() {return cable;}
    public void setCable(String cable) {this.cable = cable;}
    public String getBathroom() {return bathroom;}
    public void setBathroom(String bathroom) {this.bathroom = bathroom;}
    public String getRented() {return rented;}
    public void setRented(String rented) {this.rented = rented;}
}
/*
    The rooms should show up as a list with the address, city, state,
        and price on the list and when the user clicks on the link for an item,
        it goes to another screen and shows the detail of the individual listing:
        description, rules, wifi (yes/no), cable (none/basic/premium) and private bathroom (yes/no).
*/