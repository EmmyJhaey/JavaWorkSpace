package com.emmy.collections.arrayLists;

import java.text.NumberFormat;

public class Vehicle {

        String name;
        String color;
        double price;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + NumberFormat.getCurrencyInstance().format(price) +
                '}';
    }

    public Vehicle(String name, String color, double price) {
            super();
            this.name = name;
            this.color = color ;
            this.price = price;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
