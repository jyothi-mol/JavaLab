/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab.Lab7Prgrms;

/**
 *
 * @author Me
 */
import java.util.*;
public class MaximumArray {
    int maximum(int a[],int n)
  {
      if(n==1)
      {
          return(a[0]);
          
      }
      else
      {
        return max(maximum(a,n-1),a[n-1]);
      }
      
  }
  int max(int n1,int n2)
  {
      return(n1>n2?n1:n2);
  }
  public static void main(String args[])
  {
      int n;
      
      System.out.println("Enter the number of array elements");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      MaximumArray ma=new MaximumArray();
      int result=ma.maximum(a,n);
      System.out.println("Maximum of array="+result);
  }
}


