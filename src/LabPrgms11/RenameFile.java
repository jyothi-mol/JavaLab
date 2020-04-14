/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabPrgms11;

/**
 *
 * @author jaba
 */
import java.util.*;
import java.io.File;
import java.io.IOException;
public class RenameFile 
{
   public static void main(String args[])
   {
       boolean result;
       try
       {
           File f=new File("D:\\java\\OldFile.txt");
                   
                   result=f.createNewFile();
                   if(result)
                   {
                       System.out.println("File  Created");
                       File  f1=new File("D:\\java\\NewFile.txt");
                       boolean b=f.renameTo(f1);
                       if(b)
                           System.out.println("Renamed Successfully:)");
                       else
                           System.out.println("Error there is already a file with the same name:(");
                       f1.delete();
                       System.out.println("File Deleted");
                   }
                   else
                   {
                       System.out.println("Exists:"+f.exists());
                       File f1=new File("D:\\java\\NewFile.txt");
                       boolean b=f.renameTo(f1);
                       if(b)
                           System.out.println("Renamed successfully:)");
                       else
                           System.out.println("Error there is already a file  with the same name:(");
                       f1.delete();
                       System.out.println("File Deleted");
                    
                   }
       }
       catch(IOException e)
       {
           e.printStackTrace();
       }
   }
}
