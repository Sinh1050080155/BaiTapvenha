/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BaiTapc1 
{
    public static void main(String[] args) 
    {
        int i =0;
        int n;
        System.out.print("Nhap so nguyen n: ");
        Scanner nhap = new Scanner(System.in);
        n = nhap.nextInt();
        
       while((i*i) <= n)
       {
           if((i*i) == n)
           {
                System.out.println("n= "+ n +" La so chinh phuong");
               
           } 
                    ++i;
       } 
                System.out.println("n= "+ n +" Khong la so chinh phuong");
    }   
}
