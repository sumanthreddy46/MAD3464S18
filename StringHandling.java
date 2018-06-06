/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5java;

/**
 *
 * @author macstudent
 */
public class StringHandling {
    
    public static void main(String agrs[]) {
        String str1 = "Test";
        String str2 = new String("Java");

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);

        String str3 = str1 + str2;
        str3 = str2.concat(str1);

        System.out.println("str3 : " + str3);

        int len = str2.length();
        System.out.println(" len : " + len);

        str2 = "test string";
        for (int i = 0; i <= str2.length() - 1; i += 2) {
            System.out.print(str2.charAt(i) + " ");
        }
        System.out.println("");

        for (int i = str2.length() - 1; i >= 0; i--) {
            System.out.print(str2.charAt(i));
        }
        System.out.println("");

        str2 = "java";
        str3 = "Java";

        if (str2.equals(str3)) {
            System.out.println("Equal srtings");
        } else {
            System.out.println("Different strings");
        }

        str2 = "Java";
        str3 = "java";
        System.out.println(str2.compareToIgnoreCase(str3));
        
        System.out.println(str2.endsWith("va"));
        
        str2 = "This is a test string";
        int p;
        p = str2.indexOf('i');
        
        p = str2.indexOf("test");
        
        
        p = str2.indexOf('i',4);
        
        p = str2.lastIndexOf('i');
        
        System.out.println("p : "+p);
        
        System.out.println(str2.replace('i', '$'));
        
        str2= "this is a test string";
        int wordcount = 0;
        for(int i=0;i<str2.length();i++){
            if(Character.isWhitespace(str2.charAt(i))){
                wordcount++;
            }  
        } 
        System.out.println("wordcount : " +wordcount++);
        
        StringBuffer str4 = new StringBuffer("Hello There");
        int len1 = str4.length();
        System.out.println(str4.length());
        
        //System.out.println("str4 :" +str4);
        
        //str4.append(" Good Afternoon");
        
        //str4.setCharAt(1,'&');
        
       // str4.insert(4, "@@@");
      //  System.out.println("str4 :"+str4);
        
        //System.out.append(str4.reverse());
        
        str4.replace(0, 11, "Hey! I have replaced a stringbuffer");
        System.out.println(str4);
        
        
 
    }

}
    
