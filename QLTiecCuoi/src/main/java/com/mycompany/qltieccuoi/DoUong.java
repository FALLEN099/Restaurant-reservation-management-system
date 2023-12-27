/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import static com.mycompany.qltieccuoi.CauHinh.sc;

/**
 *
 * @author THINH
 */
public class DoUong extends ThucPham{
    private String hangSX;

    public DoUong( String tenTP, double giaTP, String hangSX) {
        super( tenTP, giaTP);
        this.hangSX=hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getHangSX() {
        return hangSX;
    }
 
    @Override
    public String toString() {
        return super.toString()+ String.format("Hang SX: %s \n",this.hangSX);
    }
}
