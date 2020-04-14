/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPrgms8;

/**
 *
 * @author jaba
 */
import Mypack.*;
public class Circle extends C1
{
    double volume;
    void calculator()
    {
        read();
        volume=pi*r*r;
    }
    void display()
    {
        System.out.println("Radius="+r);
        System.out.println("Volume of circle="+volume);
    }
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.calculator();
        c.display();
    }
}