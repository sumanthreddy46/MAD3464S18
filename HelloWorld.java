/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumanthreddy
 */
public class HelloWorld {
    public static void main(String args[])
    {
        System.out.println("Hello Java");
        int n1 = 10;
        float f1 = 10.5f;
        double d1 = 12.3546244;
        short s1 = 12;
        char c1 = 'a';
        String str1 = "java";
        boolean b1 = true;
        
        System.out.println("value of n1 is:" + n1);
        System.out.println("value of f1 is:" + f1);
        System.out.println("value of d1 is:" + d1);
        System.out.println("value of s1 is:" + s1);
        System.out.println("value of c1 is:" + c1);
        System.out.println("value of string1 is:" + str1);
        System.out.println("value of boolean is:" + b1);
        n1 *= 20;
        System.out.println("value of n1 is:" +n1);
        n1++;
        System.out.println("value of n1 is" +n1);
        ++n1;
        System.out.println("value of n1 is:" +n1);
        n1--;
        System.out.println(n1);
        --n1;
        System.out.println(n1);
        int n2=++n1;
        System.out.println("value of n2 is"+n2);
        System.out.println(n1);
        char c2 = 'A';
        System.out.println("value of c1 is " +c1);
        System.out.println("valuye of c1 is " + (char)(c1+10));
        System.out.println("value of c1 is " );
    }
   
}
