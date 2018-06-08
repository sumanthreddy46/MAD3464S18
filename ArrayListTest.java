/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author sumanth
 */
public class ArrayListTest {
    public static void main(String args[]){
      //  int [] productName = new int[6];
        ArrayList<String> productName = new ArrayList<String>();
        
        productName.add("Projector");
        productName.add("Excel");
        productName.add("Contigo");
        productName.add("Apple");
        
        productName.add(2,"Oracle");
        
        for(String raman : productName){
            System.out.println(raman);
        }
        System.out.println("======");
        
        if (productName.contains("Oracle")){
        productName.remove("Oracle");
        }
        else
        {
            System.err.println("Buy oracle first");
        }
        
        for(String raman : productName){
            System.out.println(raman);
        }
        
        Collections.sort(productName);
        System.out.println("====");
         
        for(String raman : productName){
            System.out.println(raman);
        }
        
        ArrayList<Books> library = new ArrayList<Books>();
        Books book1 = new Books(101," The sky is falling",9);
        Books book2 = new Books(102,"Pride and Prejudice",5);
        Books book3 = new Books(103,"The monk",3);
        Books book4 = new Books(104,"Courage",2);
        
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        
        for(Books bk : library){
            bk.displayInfo();
        }
        System.out.println("No of books in library : " + library.size());
        
        if(library.contains(book2)){
            library.remove(book2);
        }
        System.out.println("No of books in library : " + library.size());
        
        library.add(2, new Books(120,"Pearls",11));
        
        Collections.sort(library, new bookTitleComparator());
        for(Books bk : library){
            bk.displayInfo();
        }
        Collections.sort(library, new bookRatingComparator());
        for(Books bk : library){
            bk.displayInfo();
        }
        
    }
    
}
