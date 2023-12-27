/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import static com.mycompany.qltieccuoi.CauHinh.f;
import static com.mycompany.qltieccuoi.GenericDisPlay.displaySubList;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author THINH
 */
public class ChoThue {
    private static int dem;
    private String tenBuoiTiec;
    private String chuoiChoThue;
    private double giaBill;
    private Date ngay;
    private Buoi buoi;
    private SanhCuoi a;
    private QuanLyDV b;
    private Menu c;
    {
        setDem(getDem() + 1);
        this.setChuoiChoThue(String.format("B%03d", getDem()));
    }
   
    public double tienThue(){
        int thu = getNgay().getDay();
        if(b!=null)
        {
            return getBuoi().tienThue(getA().getGiaSC(), thu)+b.getGiaDV()+this.getC().tinhGiaMenu();
        }
        else
            return getBuoi().tienThue(getA().getGiaSC(), thu)+this.getC().tinhGiaMenu();
    }
    public ChoThue(SanhCuoi a,String ngay, Menu c,String tenBT,Buoi buoi) throws ParseException{
        Date d1;
        d1 = f.parse(ngay);
        this.tenBuoiTiec=tenBT;
        this.a=a;
        this.c=c;
        this.ngay=d1;
        this.buoi=buoi;
    }
    public ChoThue(SanhCuoi a,String ngay,QuanLyDV b, Menu c,String tenBT,Buoi buoi) throws ParseException{
        Date d1;
        d1 = f.parse(ngay);
        this.tenBuoiTiec=tenBT;
        this.a=a;
        this.b=b;
        this.c=c;
        this.ngay=d1;
        this.buoi=buoi;
    }
    public ChoThue(){}

    public Buoi getBuoi() {
        return buoi;
    }

    public void setBuoi(Buoi buoi) {
        this.buoi = buoi;
    }

    public String getTenSC(){
        return a.getTenSC();
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) throws ParseException {
        this.setNgay(f.parse(ngay));
    }
    public double getGiaBill() {
        return giaBill;
    }

    public void setGiaBill(double giaBill) {
        this.giaBill = giaBill;
    }
 
    
    public void xuatHoaDon(){
        if(b !=null)
        {
            System.out.printf("Ten Buoi tiec:%s\n",this.tenBuoiTiec);
            System.out.printf("MA Sanh Cuoi: %s\n", this.getA().getChuoiSC());
            System.out.printf("Vi tri Sanh: %s\n", this.getA().getViTriSC());
            System.out.printf("Suc Chua Sanh: %d\n", this.getA().getSucChuaSC());
            System.out.printf("Gia Sanh: %,.1f\n", getBuoi().tienThue(getA().getGiaSC(), getNgay().getDay()));
            System.out.printf("Thoi diem: %s\n", this.getBuoi());
            System.out.printf("ngay: %s\n", f.format(this.getNgay()));
            CauHinh.thu(getNgay().getDay());
            displaySubList(Arrays.asList(Arrays.asList(b)));
            System.out.printf("Ma Menu: %s\n", this.getC().getChuoiMenu());
            System.out.printf("Gia Menu: %,.1f\n", this.getC().tinhGiaMenu());
            System.out.printf("Tong Gia: %,.1f\n", tienThue());
        } else {
            System.out.printf("Ten Buoi tiec:%s\n",this.tenBuoiTiec);
            System.out.printf("MA Sanh Cuoi: %s\n", this.getA().getChuoiSC());
            System.out.printf("Vi tri Sanh: %s\n", this.getA().getViTriSC());
            System.out.printf("Suc Chua Sanh: %d\n", this.getA().getSucChuaSC());
            System.out.printf("Gia Sanh: %,.1f\n", getBuoi().tienThue(getA().getGiaSC(), getNgay().getDay()));
            System.out.printf("Thoi diem: %s\n", this.getBuoi());
            System.out.printf("ngay: %s\n", f.format(this.getNgay()));
            CauHinh.thu(getNgay().getDay());
            System.out.printf("Ma Menu: %s\n", this.getC().getChuoiMenu());
            System.out.printf("Gia Menu: %,.1f\n", this.getC().tinhGiaMenu());
            System.out.printf("Tong Gia: %,.1f\n", tienThue());
        }
    }
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the chuoiChoThue
     */
    public String getChuoiChoThue() {
        return chuoiChoThue;
    }

    /**
     * @param chuoiChoThue the chuoiChoThue to set
     */
    public void setChuoiChoThue(String chuoiChoThue) {
        this.chuoiChoThue = chuoiChoThue;
    }

    /**
     * @param ngay the ngay to set
     */
    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    /**
     * @return the a
     */
    public SanhCuoi getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(SanhCuoi a) {
        this.a = a;
    }

    public QuanLyDV getB() {
        return b;
    }

    /**
     * @param b
     */
    public void setB(QuanLyDV b) { 
        this.b = b;
    }

    /**
     * @return the c
     */
    public Menu getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Menu c) {
        this.c = c;
    }

}

