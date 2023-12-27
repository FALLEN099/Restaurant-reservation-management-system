/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import static com.mycompany.qltieccuoi.CauHinh.sc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author THINH
 */
public class QuanLyDV {
    private List<DichVu> ds = new ArrayList<>();

    public List<DichVu> getList() {
        return ds;
    }

    public void setList(List<DichVu> ds) {
        this.ds = ds;
    }
    
    public void themDV(DichVu ...p){
        this.ds.addAll(Arrays.asList(p));
    }
    
    public void themDV(DichVu p){
        this.ds.add(p);
    }
   public void themDV(){
            System.out.println("chon loai DV can them: \n1.Ca si\n2.Karaoke\n3.Trang Tri\n");
            int chon = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();
            switch(chon){
                case 1:
                    System.out.printf("\nNhap thong tin ca si: ");
                    String tt = sc.nextLine();
                    System.out.println("Nhap gia: ");
                    double gia = CauHinh.sc.nextDouble();
                    DichVu p = new MoiCaSi(tt, gia);
                    this.ds.add(p);
                    break;
                case 2:
                    System.out.println("Nhap ten DV: ");
                    String ten = CauHinh.sc.nextLine();
                    System.out.println("Nhap gia: ");
                    double giaK= CauHinh.sc.nextDouble();
                    DichVu a = new Karaoke(ten, giaK);
                    this.ds.add(a);
                    break;
                case 3:
                    DichVu b = new TrangTri();
                    this.ds.add(b);
                    break;
            }   
    }
    
    public void capNhatTen(String tenMoi,String chuoiDV){
        boolean flag = false;
        for(DichVu x : ds){
            if(x.getChuoiDV().equals(chuoiDV)==true)
            { x.setTenDV(tenMoi);
            flag = true;
            break;}
        }
        if(flag = false){System.out.println("k tim thay");}
    }
    
    public void capNhatGiaDV(double gia,String chuoiDV){
        boolean flag = false;
        for(DichVu x : ds){
            if(x.getChuoiDV().equals(chuoiDV)==true)
            { x.setGiaDV(gia);
            flag = true;
            break;}
        }
        if(flag = false){System.out.println("k tim thay");}
    }
    
    public boolean xoaDV(String chuoiDV){
         for(DichVu x : ds){
            if(x.getChuoiDV().equals(chuoiDV)==true)
            { 
                this.ds.remove(x);
                return true;
            }
        }
        return false;
    }
    public  double getGiaDV(){
        return ds.stream().mapToDouble(DichVu::getGiaDV).reduce(0,Double::sum);
    }
   public DichVu tim(String a){
       return this.ds.stream()
                  .filter(x -> x.getChuoiDV().equals(a))
                  .findFirst()
                  .orElse(null);
   }
    public List<DichVu> traCuuDV(String kw){
        return  this.ds.stream().filter(x->x.getTenDV().contains(kw)).collect(Collectors.toList());
    }
    
    @Override
    public String toString() {
        return "Danh sach Dich Vu : \n========================================\n" + ds + '}';
    }
    
}
