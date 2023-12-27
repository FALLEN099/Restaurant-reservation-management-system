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
public abstract class DichVu {
    private static int maDV;
    private String chuoiDV;
    private String tenDV;
    private double giaDV;
    
    {
        this.setChuoiDV(String.format("DV%03d", ++maDV));
    }

    public DichVu(String tenDV, double giaDV) {
        this.tenDV = tenDV;
        this.giaDV = giaDV;
    }

    public static int getMaDV() {
        return maDV;
    }

    public static void setMaDV(int maDV) {
        DichVu.maDV = maDV;
    }
    
    public DichVu(){}

    public String getChuoiDV() {
        return chuoiDV;
    }

    public void setChuoiDV(String chuoiDV) {
        this.chuoiDV = chuoiDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(double giaDV) {
        this.giaDV = giaDV;
    }
    @Override
    public String toString() {
        return String.format("\nDich Vu : \nMa DV: %s\nTen DV: %s\nGia DV: %,.1f\n",this.chuoiDV,this.tenDV,this.giaDV);
    }
}
