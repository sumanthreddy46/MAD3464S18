/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author sumanth
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Thread t1 = Thread.currentThread();
        System.out.println("current thread :" + t1);
        
        t1.setName("test thread");
        t1.setPriority(10);
        System.out.println("thread info after change:" + t1);
        System.out.println("State of thread t1 :" + t1.getState());
        System.out.println("Alive or Dead :" + t1.isAlive());
        System.out.println("Daemon or NON-Daemon :" + t1.isDaemon());
        
        try{
        for(int i=1; i<=3; i++){
            System.out.println("Main Thread : " + i);
            new FirstThread();
            new SecondThread("Second cup");
            new SecondThread("Second Inning");
            Thread.sleep(7000);
           // System.out.println("State of thread t1 :" + t1.getState());
        }
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            System.out.println("Exiting from Main Thread");
        }
    }
       
}
