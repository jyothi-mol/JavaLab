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
import java.awt.*;

public class FontChecking {
    public static void main(String args[])
    {
        Font f=new Font("TimesNewRoman", Font.BOLD+Font.ITALIC,12);
        String font=f.getName();
        int style=f.getStyle();
        int size=f.getSize();
        boolean bold=f.isBold();
        //boolean normal=f.isPlain();
        boolean italic=f.isItalic();
        System.out.println("font:"+font+" Style:"+style+" Size:"+size+" Bold:"+bold+" Italic:"+italic);
        
        
        
       
    }
}


