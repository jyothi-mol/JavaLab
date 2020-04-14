/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypack;

/**
 *
 * @author jaba
 */
import java.util.*;
public class C1 
{
     public double pi=3.141;
     public double r;
     protected void read()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the radius of the circle");
         r=sc.nextDouble();
     }
     public static void main(String args[])
     {
         C1 obj=new C1();
         obj.read();
     }
}
