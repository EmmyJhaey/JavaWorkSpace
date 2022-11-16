package com.emmy.carDealership.customer;

import com.emmy.carDealership.employee.Employee;
import com.emmy.carDealership.vehicle.Vehicle;

public class Customer {
    String name;
    double cashOnHand;
    boolean finance;
    String address;

    public Customer(String name, double cashOnHand, boolean finance, String address){
//        super();
        this.name = name;
        this.cashOnHand = cashOnHand;
        this.finance = finance;
        this.address = address;
    }

    //Getter and Setter Method

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void purchaseCar(Employee employee, Vehicle vehicle, boolean finance){
            Employee employee1  = new Employee();
            employee1.handleCustomer(this, vehicle, finance);
    }
}
