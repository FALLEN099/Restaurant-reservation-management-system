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
public class ThucAn extends ThucPham {
    private boolean anChay;

    public ThucAn(String tenTP, double giaTP ,boolean anChay) {
        super(tenTP, giaTP);
        this.anChay = anChay;
    }
    
    public boolean isAnChay() {
        return anChay;
    }

    public void setAnChay(boolean anChay) {
        this.anChay = anChay;
    }
 
    public String hienThiTP(boolean ac){
        if(ac)
        return String.format("Thuc pham an chay duoc");
        else{
        return String.format("Thuc pham Khong an chay duoc");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ String.format("An Chay: %s \n",hienThiTP(this.anChay));
    }

}
