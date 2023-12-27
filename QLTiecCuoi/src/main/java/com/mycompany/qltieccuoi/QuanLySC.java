/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author THINH
 */
public class QuanLySC {
    private List<SanhCuoi> list = new ArrayList<>();

    public List<SanhCuoi> getList() {
        return list;
    }

    public void setList(List<SanhCuoi> list) {
        this.list = list;
    }
    
    public void themSC(SanhCuoi ...p){
        this.list.addAll(Arrays.asList(p));
    }
    
    public void themSC(SanhCuoi p){
        this.list.add(p);
    }
    public void themSC(String filename) throws IOException {
    File file = new File(filename);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] f = line.split(",");
                String tenSC = f[0].trim();
                String viTriSC = f[1].trim();
                int sucChuaSC = Integer.parseInt(f[2].trim());
                double giaSc=Double.parseDouble(f[3].trim());
                SanhCuoi sc = new SanhCuoi(tenSC, viTriSC, sucChuaSC,giaSc);
                this.list.add(sc);
            }   }
}
    public void themSC(){
        System.out.printf("Nhap ten sanh cuoi: ");
        String tenSC=CauHinh.sc.nextLine();
        System.out.printf("\nNhap vi tri : ");
        String viTriSC=CauHinh.sc.nextLine();
        System.out.printf("\nNhap suc chua: ");
        int sucChua=Integer.parseInt(CauHinh.sc.next());
        System.out.printf("\nNhap gia: ");
        double gia=Double.parseDouble(CauHinh.sc.next());
        SanhCuoi p = new SanhCuoi(tenSC, viTriSC, sucChua, gia);
            this.list.add(p);
 
    }
    
    public void capNhatTen(String ten,String chuoiSC){
        boolean flag = false;
        for(SanhCuoi x : list){
            if(x.getChuoiSC().equals(chuoiSC)==true)
            { x.setTenSC(ten);
            flag = true;
            break;}
        }
        if(flag = false){System.out.println("k tim thay");}
    }
    
    public void capNhatSucChua(int sucChua,String chuoiSC){
        boolean flag = false;
        for(SanhCuoi x : list){
            if(x.getChuoiSC().equals(chuoiSC)==true)
            { x.setSucChuaSC(sucChua);
            flag = true;
            break;}
        }
        if(flag = false){System.out.println("k tim thay");}
    }
    
    public boolean xoaSC(String chuoiSC){
        for(SanhCuoi x : list){
            if(x.getChuoiSC().equals(chuoiSC)==true)
            { 
                this.list.remove(x);
                return true;
            };
            break;
        }
        return true;
    }
    public List<SanhCuoi> traCuuSC(String kw){
        return  this.list.stream().filter(x->x.getTenSC().contains(kw)).collect(Collectors.toList());
    }
   public List<SanhCuoi> traCuuSC(int from, int to) {
    return this.list.stream().filter(x -> x.getSucChuaSC()>= from && x.getSucChuaSC()<= to).collect(Collectors.toList());
}
    @Override
    public String toString() {
        return "Danh sach Sanh Cuoi : \n========================================\n" + list + '}';
    }
}
