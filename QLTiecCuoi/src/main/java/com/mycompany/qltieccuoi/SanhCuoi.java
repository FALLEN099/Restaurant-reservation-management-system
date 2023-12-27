/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;



/**
 *
 * @author THINH
 */
public class SanhCuoi {
    private static int maSC;
    private String chuoiSC;
    private String tenSC;
    private String viTriSC;
    private int sucChuaSC;
    private double giaSC;
    
    {
        
        this.setChuoiSC(String.format("SC%03d", ++maSC));
    }

    public SanhCuoi(String tenSC, String viTriSC, int sucChuaSC,double gia) {
        this.tenSC = tenSC;
        this.viTriSC = viTriSC;
        this.sucChuaSC = sucChuaSC;
        this.giaSC=gia; 
    }
    
    public SanhCuoi(){}
    
    public String getChuoiSC() {
        return chuoiSC;
    }

    public double getGiaSC() {
        return giaSC;
    }

    public void setGiaSC(double giaSC) {
        this.giaSC = giaSC;
    }

    public void setChuoiSC(String chuoiSC) {
        this.chuoiSC = chuoiSC;
    }

    public String getTenSC() {
        return tenSC;
    }

    public void setTenSC(String tenSC) {
        this.tenSC = tenSC;
    }

    public String getViTriSC() {
        return viTriSC;
    }

    public void setViTriSC(String viTriSC) {
        this.viTriSC = viTriSC;
    }

    public int getSucChuaSC() {
        return sucChuaSC;
    }

    public void setSucChuaSC(int sucChuaSC) {
        this.sucChuaSC = sucChuaSC;
    }
    @Override
    public String toString() {
        return String.format("\n++++++++\n\nSanh Cuoi : \nMa SC: %s\nTen SC: %s\nVi Tri SC: %s\nSuc Chua SC: %d\nGia SC:%.1f"
                ,this.chuoiSC,this.tenSC,this.viTriSC,this.sucChuaSC,this.giaSC);
    }
}
