/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author THINH
 */
public class Menu {
    private List<ThucPham> ds = new ArrayList<>();
    private static int maMenu ;
    private String chuoiMenu ;
    
    {
        this.chuoiMenu = String.format("MN%03d", ++maMenu);
    }

    public List<ThucPham> getDs() {
        return ds;
    }

    public void setDs(List<ThucPham> ds) {
        this.ds = ds;
    }

    public static int getMaMenu() {
        return maMenu;
    }

    public static void setMaMenu(int maMenu) {
        Menu.maMenu = maMenu;
    }
    
    public String getChuoiMenu() {
        return chuoiMenu;
    }
    
    public void setChuoiMenu(String chuoiMenu) {
        this.chuoiMenu = chuoiMenu;
    }
    
    public List<ThucPham> getList() {
        return ds;
    }
    
    public void setList(List<ThucPham> ds) {
        this.ds = ds;
    }
    
    public void themTP(ThucPham ...p){
        this.ds.addAll(Arrays.asList(p));
    }
    
    public void themTP(ThucPham p){
        this.ds.add(p);
    }
    
    public void capNhatTenTP(String ten,String chuoiTP){
        boolean flag = false;
        for(ThucPham x : ds){
            if(x.getChuoiTP().equals(chuoiTP)==true)
            { x.setTenTP(ten);
            flag = true;
            break;}
        }
        if(flag = false)
            System.out.println("k tim thay");
    }
    public void capNhatGiaTP(double gia,String chuoiTP){
        boolean flag = false;
        for(ThucPham x : ds){
            if(x.getChuoiTP().equals(chuoiTP)==true)
            { x.setGiaTP(gia);
            flag = true;
            break;}
        }
        if(flag = false)
            System.out.println("k tim thay");
    }
    
    public boolean xoaTP(String chuoiTP){
        for(ThucPham x : ds){
            if(x.getChuoiTP().equals(chuoiTP)==true)
            { 
                this.ds.remove(x);
                return true;
            }
        }
        return true;
    }
    
    public List<ThucPham> traCuuTP(String kw){
        return  this.ds.stream().filter(x->x.getTenTP().contains(kw)).collect(Collectors.toList());
    }
    
     public void themMenu(int n){
         for(int i=0;i<n;i++){
           System.out.println("===Nhap loai thuc pham ban muon them=== \n 1:THUC AN \n 2:DO UONG");
           int loaiTP=CauHinh.sc.nextInt();
           CauHinh.sc.nextLine();
           if(loaiTP==1){
               System.out.println("Nhap Ten thuc an:");
               String tenTA= CauHinh.sc.nextLine();
               CauHinh.sc.nextLine();
               System.out.println("Nhap Gia");
               double giaTA=Double.parseDouble(CauHinh.sc.nextLine());
               System.out.println("Co An Chay duoc khong ? \n true:Co\n false:Khong \n");
               boolean isChay=CauHinh.sc.nextBoolean();
               ThucPham p= new ThucAn(tenTA, giaTA, isChay);
               this.ds.add(p);
           }
           else{
               System.out.println("Nhap Ten do uong:");
               String tenTA= CauHinh.sc.nextLine();
               CauHinh.sc.nextLine();
               System.out.println("Nhap Gia");
               double giaTA=Double.parseDouble(CauHinh.sc.nextLine());
               System.out.println("Nhap Hang SX");
               String hangSX=CauHinh.sc.nextLine();
               ThucPham p= new DoUong(tenTA, giaTA, hangSX);
               this.ds.add(p);
           }
         }
        }
    public double tinhGiaMenu(){
        return this.ds.stream().mapToDouble(ThucPham::getGiaTP).reduce(0.0,Double::sum);
    }

    @Override
    public String toString() {
        return String.format("\nMenu: \n=========================\nMa Menu : %s\nGia Menu: %.1f\n",this.chuoiMenu,this.tinhGiaMenu())+ ds;
    }
}
