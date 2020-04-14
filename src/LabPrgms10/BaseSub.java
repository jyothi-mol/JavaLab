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
class BaseSub
{
  void msg()throws ArithmeticException
  {
     System.out.println("parent");
     int a=10,b=0;
     int c=a/b;
  }
}

class TestExceptionChild extends BaseSub
{
  void msg()
  {
    int arr[]=new int[4];
    System.out.println("child");
    arr[4]=4;
 
   }
   public static void main(String args[]){
   BaseSub b=new TestExceptionChild();
   try
   {
   b.msg();
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
     System.out.println("ArrayIndexOutOfBounds Exception Caught");
   }
  }
}


