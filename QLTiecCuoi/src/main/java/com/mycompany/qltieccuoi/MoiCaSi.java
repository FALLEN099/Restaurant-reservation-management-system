/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import static com.mycompany.qltieccuoi.CauHinh.sc;

/**
 *
 * @author An
 */
public class MoiCaSi extends DichVu{
     private String thongTinCS;
    private int soBaiHat;
     public MoiCaSi (String thongTinCS,double gia) {
        super("Ca si", gia);
        this.thongTinCS = thongTinCS;
    }
     public MoiCaSi(){};
    public String getThongTinCS() {
        return thongTinCS;
    }
    
    public void setThongTinCS(String thongTinCS) {
        this.thongTinCS = thongTinCS;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }
 
    @Override
    public String toString() {
        return super.toString()+ String.format("Thong Tin CS: %s\nSo Bai Hat %d",this.thongTinCS,this.soBaiHat);
    }
}
