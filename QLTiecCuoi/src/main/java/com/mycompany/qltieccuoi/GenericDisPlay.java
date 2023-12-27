/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author THINH
 * @param <T>
 */
public class GenericDisPlay<T> {
//    @Target(ElementType.FIELD)
//    @Retention(RetentionPolicy.RUNTIME)
//    public @interface InputField {}
//
//    // Hàm generic để nhập dữ liệu cho mọi kiểu dữ liệu, nhưng chỉ chọn lọc những thuộc tính có annotation @InputField
//    public static <T> void inputData(T obj) throws IllegalAccessException {
//        Scanner sc = new Scanner(System.in);
//        Field[] fields = obj.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            if  (field.isAnnotationPresent(InputField.class)) {
//                field.setAccessible(true);
//                Object value;
//                System.out.print("Nhap: ");
//                if(field.getType()== double.class){
//                    value = sc.nextDouble();
//                }else if (field.getType() == String.class) {
//                    value = sc.nextLine();
//                }
//                else if (field.getType() == int.class) {
//                    value = sc.nextInt();
//                }else {
//                    continue; // Bỏ qua những kiểu dữ liệu khác Double,Int và String
//                }
//                field.set(obj, value);
//            }
//        }
//    }
    
    public static <T> void displaySubList(List<List<T>> t){
        for (List<T> subList : t) {
            System.out.println(subList.toString());
        }
    }
    
    public static <T> void displaySubSubList(List<List<T>> t){
        for (List<T> subList : t) {
            System.out.println(subList.toString());
        }
    }
    
    public static <T> void add(List<T> t,T a){
        t.add(a);
    }
    
    public static <T> boolean remove(List<T> t,T obj){
        return t.remove(obj);
    }
}
