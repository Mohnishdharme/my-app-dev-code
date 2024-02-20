package com.task.StaticEx1;

//MathOperations.java
public class MathOperations {
    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Perform addition using the add method
        int result1 = add(5, 7);
        int result2 = add(10, 20);

        // Display the results
        System.out.println("Adding 5 and 7: " + result1);
        System.out.println("Adding 10 and 20: " + result2);
    }
}

