package day16.Java_Module_Demo.moduleB.src.com.demo.app;

import com.demo.service.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition = " +
                calculator.add(10, 20));

        System.out.println("Multiplication = " +
                calculator.multiply(10, 20));
    }
}
