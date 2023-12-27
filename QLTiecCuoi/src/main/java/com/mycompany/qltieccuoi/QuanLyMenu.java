/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import static com.mycompany.qltieccuoi.CauHinh.sc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author THINH
 */
public class QuanLyMenu {
    private List<Menu> ds = new ArrayList<>();

    public List<Menu> getList() {
        return ds;
    }

    public void setList(List<Menu> ds) {
        this.ds = ds;
    }
    public void themDV(Menu p){
        this.ds.add(p);
    }
    
    public void themMenu(){
        System.out.println("nhap menu");
        Menu a = new Menu();
        System.out.println("nhap vao so luong mon an can them");
        int n = sc.nextInt();
        a.themMenu(n);
        this.ds.add(a);
    }

    public void themMenu(String tenFile) {
        try {
            File file = new File(tenFile);
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.isEmpty()) continue;
                    Menu menu = new Menu();
                    String[] parts = line.split(",");
                    for (int i = 0; i < parts.length; i += 4) {
                        String loaiTP = parts[i];
                        String tenTP = parts[i+1];
                        double giaTP = Double.parseDouble(parts[i+2]);
                        if (loaiTP.equals("ThucAn")) {
                            boolean anChay = Boolean.parseBoolean(parts[i+3]);
                            ThucAn thucAn = new ThucAn(tenTP, giaTP, anChay);
                            menu.themTP(thucAn);
                        } else if (loaiTP.equals("DoUong")) {
                            String hangSX = parts[i+3];
                            DoUong doUong = new DoUong(tenTP, giaTP, hangSX);
                            menu.themTP(doUong);
                        }
                    }
                    this.ds.add(menu);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        }
    }   
    @Override
    public String toString() {
        return "Danh sach Menu : \n============================================\n" + ds + '}';
    }
}

