package com.example;

class Data {
    // private variable
    public String name;
}

public class Main {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.name = "Programiz"; // private variables can be accessed only within the class
    }
}