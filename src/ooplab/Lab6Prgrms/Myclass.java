/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab.Lab6Prgrms;

/**
 *
 * @author Me
 */
import java.util.*;

interface A
{
    void meth1();
    void meth2();
}
public class Myclass implements A{
    
     int x,y;
     public void meth1()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 2 numbers x and y");
         x=sc.nextInt();
         y=sc.nextInt();
         
     }
     public void meth2()
     {
         System.out.println("x="+x+"y="+y);
     }
     public static void main(String args[])
     {
         A obj=new Myclass();
         obj.meth1();
         obj.meth2();
         
         
     }
    
}

