package com.emmy.carDealership.employee;

import com.emmy.carDealership.customer.Customer;
import com.emmy.carDealership.vehicle.Vehicle;

import java.text.NumberFormat;

public class Employee {
    String name;
    String gender;

    public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance){
        if(finance)
            financeCar(customer, vehicle);
        else
            processTransaction(customer, vehicle);
    }

    public void financeCar(Customer customer, Vehicle vehicle){
        if(customer.getCashOnHand() >= vehicle.getPrice()){
            System.out.println("Customer is Eligible to Purchase Car.... ");
            System.out.println("=================Purchase Processed================");
            processTransaction(customer, vehicle);
        }else {
            double totalAmount = vehicle.getPrice() - customer.getCashOnHand();
            System.out.println("A sum of " + NumberFormat.getCurrencyInstance().format(customer.getCashOnHand()) + " has been deposited for financing " + vehicle.getName());
            System.out.println("Amount remaining for total payment is : " + NumberFormat.getCurrencyInstance().format(totalAmount));
        }
    }

    public  void processTransaction(Customer customer, Vehicle vehicle){
        if(customer.getCashOnHand() >= vehicle.getPrice()){
            double amountLeft = customer.getCashOnHand() - vehicle.getPrice();
            String formattedAmount = NumberFormat.getCurrencyInstance().format(amountLeft);
            System.out.println("Successfully Purchased " + vehicle.getName() + " for " + NumberFormat.getCurrencyInstance().format(vehicle.getPrice()));
            System.out.println(customer.getName() + " Bal = " + formattedAmount);
        }else
            System.out.println(customer.getName() + ", you do not have enough cash on hand");
    }
}
