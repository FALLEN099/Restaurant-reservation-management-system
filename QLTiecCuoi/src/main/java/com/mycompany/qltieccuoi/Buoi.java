/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;


/**
 *
 * @author THINH
 */
public enum Buoi {
        SANG(){
            @Override
            public double tienThue(double tien,int thu) {
                if(thu==0||thu==6)
                    return (tien*20/100+tien);
                else
                    return tien;
            }
        },
        TRUA() {
            @Override
            public double tienThue(double tien, int thu) {
                 if(thu==0||thu==6)
                    return (tien*30/100+tien);
                else
                    return tien*5/100+tien;
            }
        },
        TOI() {
            @Override
            public double tienThue(double tien, int thu) {
                 if(thu==0||thu==6)
                    return (tien*40/100+tien);
                else
                    return tien*10/100+tien;
            }
            
        };
       
       
        public abstract double tienThue(double tien,int thu);
    }
