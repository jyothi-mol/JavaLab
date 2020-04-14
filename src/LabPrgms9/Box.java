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
class Box 
{
        int l; 
        int b; 
       public Box() 
       {
            l =0; 
            b =0;
       }
       public Box(int x,int y) 
       {
            l = x; 
            b =y; 
       }
       public void setval(int x,int y) 
       {
            l = x; 
            b = y;
       }    
    public int area() 
    {
        return(l*b); 
    }
}
class Box3d extends Box 
{
        int h; 
        public Box3d() 
       {
            super(); 
            h=0; 
       }
    public Box3d(int x, int y, int z) 
    {
          super(x,y); 
          h=z;
    }
    public void setval (int x, int y, int z) 
    {
         super.setval(x,y); 
         h=z;
    }
public int volume() 
{
       return(super.area()*h); 
}
public static void main(String args [ ]) 
{
Box b1=new Box(); 
Box3d b2=new Box3d(5,7,4); 
b1.setval(8,9);
System.out.println("The area of b1 is : " + b1.area( )); 
System.out.println("The volume of b2 is : "+ b2.volume ( ));
}
}