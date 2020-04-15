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
class Outer
{
    void display()
    {
        String s="I'm Outer Class";
        System.out.println(s);
   
        class Inner
        {
            void display()
            {
                String s="I'm Inner Class";
                System.out.println(s);
            }
        }
        Inner i=new Inner();
        i.display();
        
    }
}
public class InnerOuter {
    public static void main(String args[])
    {
        Outer ot=new Outer();
        ot.display();
    }
}


