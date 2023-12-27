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
public class Karaoke extends DichVu{
    private int thoiGianThue;

    public Karaoke(int thoiGianThue,double gia) {
        super("Karaoke", gia);
        this.thoiGianThue = thoiGianThue;
    }
    public Karaoke(String tenDV, double giaDV) {
        super(tenDV, giaDV);
    }

    public Karaoke() {
    }
    
    public int getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(int thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }
    
    @Override
    public String toString() {
        return super.toString()+ String.format("Thoi Gian Thue: %d minutes\n",this.thoiGianThue);
    }
    
    
}
