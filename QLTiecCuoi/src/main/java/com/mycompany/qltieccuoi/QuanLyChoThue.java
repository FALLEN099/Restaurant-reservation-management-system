/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author THINH
 */
public class QuanLyChoThue {
    private List<ChoThue> list = new ArrayList<>();

    public List<ChoThue> getList() {
        return list;
    }

    public void setList(List<ChoThue> list) {
        this.list = list;
    }
    
    public void themHD(ChoThue ...p){
        this.list.addAll(Arrays.asList(p));
    }
    
    public void themHD(ChoThue p){
        this.list.add(p);
    }
    
    public void sapXepSD(String date) throws ParseException{
        Date s = CauHinh.fo.parse(date);
        List<ChoThue> p = this.list.stream().filter(x->(s.getYear()==x.getNgay().getYear())).collect(Collectors.toList());
        Map<String, Long> Count = (Map<String, Long>) p.stream()
        .map(ChoThue::getTenSC) // lấy tenSC của mỗi đối tượng BILL
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // đếm số lần xuất hiện của mỗi chuoiSC

        List<Map.Entry<String, Long>> sortedCount = Count.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // sắp xếp giảm dần theo số lần xuất hiện
        .collect(Collectors.toList());
        
        for (Map.Entry<String, Long> entry : sortedCount) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public void BCDoanhThu(){
        Map<String, Double> doanhThuTheoThang = new TreeMap<String, Double>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int thang1 = Integer.parseInt(o1.substring(1));
                int thang2 = Integer.parseInt(o2.substring(1));
                return Integer.compare(thang1, thang2);
            }
        });
        Map<String, Double> doanhThuTheoQuy = new HashMap<String, Double>();
        
        for(ChoThue x : list){
            String keyThang = String.format("T%d",x.getNgay().getMonth()+1);
            String keyQuy = "";
            
            if (x.getNgay().getMonth() <= 2) {
                keyQuy = "Q1";
            } else if (x.getNgay().getMonth() <= 5) {
                keyQuy = "Q2";
            } else if (x.getNgay().getMonth() <= 8) {
                keyQuy = "Q3";
            } else {
                keyQuy = "Q4";
            }
            double giaBill = x.tienThue();
            
            if (doanhThuTheoThang.containsKey(keyThang)) {
                giaBill += doanhThuTheoThang.get(keyThang);
            }
            doanhThuTheoThang.put(keyThang, giaBill);

            giaBill = x.tienThue();
            if (doanhThuTheoQuy.containsKey(keyQuy)) {
                giaBill += doanhThuTheoQuy.get(keyQuy);
            }
            doanhThuTheoQuy.put(keyQuy, giaBill);
            }
            System.out.println("Doanh thu theo thang:");
            for (Map.Entry<String, Double> entry : doanhThuTheoThang.entrySet()) {
                if(entry.getValue()>=10000000){
                    String formattedAmount = String.format("%,.2f", entry.getValue());
                    System.out.println(entry.getKey() + ": " +formattedAmount + " VND");
                }
                else {
                String formattedAmount = String.format("%,.1f", entry.getValue());
                System.out.println(entry.getKey() + ": " + formattedAmount+ " VND");
                }
            }
            System.out.println("Doanh thu theo quy:");
            for (Map.Entry<String, Double> entry : doanhThuTheoQuy.entrySet()) {
                if(entry.getValue()>=10000000){
                    String formattedAmount = String.format("%,.2f", entry.getValue());
                    System.out.println(entry.getKey() + ": " +formattedAmount+ " VND");
                }
                else {
                String formattedAmount = String.format("%,.1f", entry.getValue());
                System.out.println(entry.getKey() + ": " + formattedAmount+ " VND");
                }
            }
        }
        @Override
        public String toString() {
            return "Danh sach Bill : \n=============================================\n" + list + '}';
        }
    }
