/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPrgms10;

/**
 *
 * @author jaba
 */

import java.io.*;  
class T1 
{ 
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Throws
{  
   public static void main(String args[]){  
    try
    {  
     T1 m=new T1();  
     m.method();  
    }
    catch(Exception e)
    {
        System.out.println("Exception handled");
    }     
  
    System.out.println("Normal Flow");  
  }  
}  