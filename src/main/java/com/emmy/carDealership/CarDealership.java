package com.emmy.carDealership;

import com.emmy.carDealership.customer.Customer;
import com.emmy.carDealership.employee.Employee;
import com.emmy.carDealership.vehicle.Vehicle;

public class CarDealership {

    //Program Entry Point
    public static void main(String[] args) {

        //Creating customer object
        Customer customer = new Customer("Tom", 14_500, true, "123 Street");
        //Create vehicle object
        Vehicle vehicle = new Vehicle("Benz", 12_400);
        //Create Employee object
        Employee employee = new Employee();

        customer.purchaseCar(employee, vehicle, true);


    }

}
