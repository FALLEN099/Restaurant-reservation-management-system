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
public abstract class ThucPham {
    private static int maTP;
    private String chuoiTP;
    private String tenTP;
    private double giaTP;
    
    {
        this.setChuoiTP(String.format("TP%03d",++maTP));
    }
    public ThucPham(String tenTP, double giaTP) {
        this.tenTP = tenTP;
        this.giaTP = giaTP;
    }

    public ThucPham(){
    }
    
    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public double getGiaTP() {
        return giaTP;
    }

    public void setGiaTP(double giaTP) {
        this.giaTP = giaTP;
    }

    public String getChuoiTP() {
        return chuoiTP;
    }

    public void setChuoiTP(String chuoiTP) {
        this.chuoiTP = chuoiTP;
    }
    public void hienThiTP(){
        System.out.printf("\nChuoi Thuc Pham: %s",this.chuoiTP);
        System.out.printf("\nTen Thuc Pham: %s",this.tenTP);
        System.out.printf("\nGia Thuc Pham: %s",this.giaTP);
    }
    
    @Override
    public String toString() {
        return String.format("\nThuc Pham : \nMa TP: %s\nTen TP: %s\nGia TP: %,.1f\n",this.chuoiTP,this.tenTP,this.giaTP);
    }
}
