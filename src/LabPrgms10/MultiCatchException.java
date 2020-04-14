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
class MultiCatchException 
{
       public static void main(String a[]) 
       {
              int a1[]={100,200,300,400,500};
              System.out.println("Enter a number as array index");
              try
              {
                    String line; 
                    int x;
                    BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
                    while((line = d.readLine())!=null) 
                    {
                        if (line.equals("end")) 
                        break;
                    else 
                    { 
                       try 
                       { 
                           x=Integer.parseInt(line); 
                           System.out.println("valid element:"+a1[x]);
                       }
catch(ArrayIndexOutOfBoundsException e) 
{
       System.out.println("Invalid elements");
       System.out.println("Exception generated:"+e); 
}
catch(NumberFormatException n) 
{
       System.out.println("No characters"); 
       System.out.println("Generated exception:"+n); 
}
}
                    } 
              }catch(IOException i){ } 
       } 
}               