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
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
       
        super(s); 
    } 
} 
public class Main 
{ 
    
    public static void main(String args[]) 
    { 
        try
        { 
            
            throw new MyException("Hello World"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Hai"); 
  
            
            System.out.println(ex.getMessage()); 
        } 
    } 
} 



