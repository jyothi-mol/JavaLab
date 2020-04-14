/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPrgms9;

/**
 *
 * @author jaba
 */
import java.util.*;
public class Override 
{
       void test() 
       {
            System.out.println("hello");  
       }
       void test (int a, int b) 
       {
            System.out.println("a and b: " + a +" " + b); 
       }
       void test (double a) 
       {
            System.out.println ("Value of  a : "+ a); 
       }
}
class Overridedemo 
{
        public static void main (String args[]) 
        {
              Override ob = new Override(); 
              ob.test(); 
              ob.test(5); 
              ob.test(10,20); 
              ob.test(30,40);
        }
}
