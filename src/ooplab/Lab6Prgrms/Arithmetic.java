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

    

interface Test
{
    void square();
}

public class Arithmetic implements Test{
    int x;
    public void square()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        
        x=sc.nextInt();
        System.out.println("Square of "+x+"="+(x*x));
    }
}
 class ToTestInt
{
    public static void main(String args[])
    {
        Test obj=new Arithmetic();
        obj.square();
    }
}
