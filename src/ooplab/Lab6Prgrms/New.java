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
interface I1
{
    int x=10;
    void add();
}

interface I2
{
    int x=20;
    void multiply();
}
public class New implements I1,I2{
    public void add()
    {
        System.out.println("Sum="+(I1.x+I2.x));
    }
    public void multiply()
    {
        System.out.println("Product="+(I1.x*I2.x));
    }
    public static void main(String args[])
    {
        New obj=new New();
        obj.add();
        obj.multiply();
    }
    
}

