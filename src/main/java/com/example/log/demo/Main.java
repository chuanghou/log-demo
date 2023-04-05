package com.example.log.demo;

import org.hibernate.validator.constraints.Length;

public class Main {
    public static void main(String[] args) {
        Fool fool = new Fool();
        fool.testLogOfPackage("Hello World");
    }

    public static class Fool {
        public void testLogOfPackage(@Length(min = 30) String str) {
            System.out.println(str);
        }
    }
}