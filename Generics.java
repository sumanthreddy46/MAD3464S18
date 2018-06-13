/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 * Demonstrating the concept of generics
 * @author sumanth
 * @version 1.0
 * @since 13 jun 2018
 */
public class Generics {
    // generic method printArray
    /**
     * Printing list of elements
     * @param <E> Indicates generic type
     * @param inputArray List of elements to be printed
     * 
     */
    public static < E > void printArray( E[] inputArray){
        
        for(E element : inputArray){
            System.out.printf("%s ,", element);
        }
        System.out.println();
    }
    
    /**
     * 
     * @param <T> Generic Type
     * @param x first value
     * @param y second value
     * @param z third value
     * @return Returns maximum of three elements
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0 ) {
            max = y;
        }
        if(z.compareTo(max) > 0 ) {
            max = z;
        }
        return max;
    }
    
    /**
     * 
     * @param args Command Line arguments
     * @return no return value
     */
    public static void main(String args[]){
        
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer value : %d \n", integerBox.get());
        
        Box<String> stringBox = new Box<String>();
        stringBox.set(new String("Hello World"));
        System.out.printf("String value :%s\n\n", stringBox.get());
    
    
    Integer[] intArray = { 1,2,3,4,5 };
    System.out.println("Array integerArray contains");
    printArray(intArray);
    
    Double[] doubleArray = { 1.1,2.2,3.3,4.4 };
    System.out.println("\n Array doubleArray contains:");
    printArray(doubleArray);
    
    Character[] charArray = { 'H','E','L','L','O' };
    System.out.println("\n Array characterArray conatins:");
    printArray(charArray);
    
    System.out.printf("Max of %d,%d and %d is %d\n\n", 3,4,5, maximum(3,4,5));
    
    System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6,8.8,7.7, maximum( 6.6,8.8,7.7 ));
    
    System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
  
    }
}
