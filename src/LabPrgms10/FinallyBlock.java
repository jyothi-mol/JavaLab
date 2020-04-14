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
import java.util.*;
class TestFinallyBlock
{  
      public static void main(String args[])
      {  
        try{  
        int data=25/5;  
        System.out.println(data);  
       }  
        catch(NullPointerException e)
        {
            System.out.println(e);
        }  
  finally
        {
            System.out.println("Finally Block");
        }  
            System.out.println("Program Content");  
        }  
}  
