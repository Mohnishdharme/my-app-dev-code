package com.homework.HW3;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1,23,232,4,34,34,4343,4,34,3};
        
        //this line is used to store the length,index of the array
        int length = array.length;
        
        //This line is used to print the value of array
        System.out.println("Original array: ");
        for (int i = 0; i<length ; i++) {
        	System.out.print(array[i] + " ");
        }
      
        
        // Reversing the array using a for loop
        System.out.println(length);
        for (int i = 0 ; i<length/2; i++) {
        	int temp = array[i];
        	array[i] = array[length - 1 - i]; 
        	array[length - 1 - i] = temp;
        }
      
        System.out.println("\nReversed array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
