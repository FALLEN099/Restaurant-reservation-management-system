/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 *
 * @author THINH
 */
public class CauHinh {
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat fo = new SimpleDateFormat("yyyy"); 
    public static final Scanner sc = new Scanner(System.in);
    public static void thu(int n){
        switch(n){
            case 0->{
                System.out.println("Chu Nhat\n");
                break;
            }
            case 1->{
                System.out.println("Thu Hai\n");
                break;
            }
            case 2->{
                System.out.println("Thu Ba\n");
                break;
            }
            case 3->{
                System.out.println("Thu Tu\n");
                break;
            }
            case 4->{
                System.out.println("Thu Nam\n");
                break;
            }
            case 5->{
                System.out.println("Thu Sau\n");
                break;
            }
             case 6->{
                System.out.println("Thu Bay\n");
                break;
            }
        }
               
    }
}
