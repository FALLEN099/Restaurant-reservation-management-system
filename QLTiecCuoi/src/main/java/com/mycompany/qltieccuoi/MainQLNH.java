      /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qltieccuoi;
import java.io.IOException;
import java.text.ParseException;
import static com.mycompany.qltieccuoi.GenericDisPlay.displaySubList;
import java.util.Arrays;
/**
 *
 * @author THINH
 */
public class MainQLNH {
    public static void tenCaSi(){
        System.out.println("===Ten Ca Si co the thue===");
        System.out.println("Son Tung");
        System.out.println("Mono");
        System.out.println("Cam ly");
    }
    public static void menuMain(){
        System.out.println("=================Chon Chuc Nang=================");
        System.out.println("*             1.Thue Sanh Cuoi                 *");
        System.out.println("*             2.Xem lai Bill                   *");
        System.out.println("*             3.Cap Nhap                       *");
        System.out.println("*             4.Sap xep giam dan theo tan so   *");
        System.out.println("*             5.Bao Cao                        *");
        System.out.println("*             6.Thoat                          *");
        System.out.println("================================================");
    }
    public static void capNhap(){
        System.out.println("============Chon Chuc Nang Cap Nhat=============");
        System.out.println("*               1.Sanh Cuoi                    *");
        System.out.println("*               2.Dich Vu                      *");
        System.out.println("*               3.Menu                         *");
        System.out.println("*               4.Thoat                        *");
        System.out.println("================================================");
    }
    public static void capNhapSC(){
        System.out.println("=================Chon Chuc Nang=================");
        System.out.println("*               1.Them Sanh Cuoi               *");
        System.out.println("*               2.Xoa Sanh Cuoi                *");
        System.out.println("*               3.Tra Cuu Theo Tên             *");
        System.out.println("*               4.Tra cuu theo suc chua        *");
        System.out.println("*               5.Thoat                        *");
        System.out.println("================================================");
    }
    public static void capNhapDV(){
        System.out.println("=================Chon Chuc Nang=================");
        System.out.println("*               1.Them Dich Vu                 *");
        System.out.println("*               2.Xoa Dich Vu                  *");
        System.out.println("*               3.Tra cuu theo ten             *");
        System.out.println("*               4.Hien Thi DV                  *");
        System.out.println("*               5.Thoat                        *");
        System.out.println("================================================");
    }
    public static void main(String[] args) throws ParseException, IOException {
        String f ="src/main/resources/SanhCuoi.txt";
        QuanLySC QLSC =new QuanLySC();
        QLSC.themSC(f);
        QuanLyMenu q= new QuanLyMenu();
        String file="src/main/resources/Menu.txt";
        q.themMenu(file);      
        DichVu dv1 = new MoiCaSi ( "Son Tung", 1000000);
        DichVu dv2 = new MoiCaSi ( "Cam Ly", 500000);
        DichVu dv3 = new TrangTri();
        DichVu dv4 =new Karaoke("karaoke", 500000);
         DichVu dv5 =new Karaoke("karaoke Vip", 500000);
        QuanLyDV QLDV= new QuanLyDV();
        QLDV.themDV(dv1,dv2,dv3,dv4,dv5);
        ChoThue ct1=new ChoThue(QLSC.getList().get(0), "20/12/2023",QLDV,q.getList().get(0), "Bay tan", Buoi.TOI);
        ChoThue ct2=new ChoThue(QLSC.getList().get(2), "20/09/2023",QLDV,q.getList().get(0), "Sinh Nhay", Buoi.TOI);
        ChoThue ct3=new ChoThue(QLSC.getList().get(0), "22/06/2023",QLDV,q.getList().get(0), "Qua cuoi", Buoi.SANG);
        ChoThue ct4=new ChoThue(QLSC.getList().get(3), "20/05/2023",QLDV,q.getList().get(0), "Noel", Buoi.TRUA);
        ChoThue ct5=new ChoThue(QLSC.getList().get(2), "20/01/2023",QLDV,q.getList().get(0), "Chuc mung", Buoi.TRUA);
        QuanLyChoThue QLCT= new QuanLyChoThue();
        QLCT.themHD(ct1,ct2,ct3,ct4,ct5);
        ChoThue tamChoThue=new ChoThue();
        int n;
          
          do {            
                menuMain();
              System.out.println("Chon chuc nang: ");
              n=CauHinh.sc.nextInt();
              CauHinh.sc.nextLine();
              switch (n) {
                  case 1 -> {
                      System.out.println("Nhap ten buoi tiec");
                      String tenBT= CauHinh.sc.nextLine();
                      displaySubList(Arrays.asList(Arrays.asList(QLSC)));
                      System.out.println("Chon Sanh Cuoi Muon Thue");
//                      CauHinh.sc.nextLine();
                      int s=Integer.parseInt(CauHinh.sc.nextLine());
                      SanhCuoi aCuoi= new SanhCuoi();
                      aCuoi=QLSC.getList().get(s-1);
                      System.out.println("Chon Buoi:\n SANG\n TRUA\n TOI");
                      Buoi  type = Buoi.valueOf(CauHinh.sc.next().toUpperCase());
                      System.out.println("");
                      System.out.println("Nhap Ngay dd/MM/yyyy");
                      String ngay=CauHinh.sc.next();
                      System.out.println("=====Chon Menu=====");
                      displaySubList(Arrays.asList(Arrays.asList(q)));
                      System.out.println("Chon Menu cho bua tiec");
                      int m=CauHinh.sc.nextInt();
                      Menu amenu = new Menu();
                      amenu=q.getList().get(m-1);
                      System.out.println("+++====Chon Dich vu===+++");
                      System.out.print("Ban co muon su dung them Dich Vu \n1:Co \n2:Khong \n");
                      int flag=CauHinh.sc.nextInt();
                      if(flag==1){
                          QuanLyDV bDV=new QuanLyDV();
                          System.out.println("So dich vu muon thue:\n");
                          int so=CauHinh.sc.nextInt();
                          while (so>0) {                              
                              System.out.println("================CHON DICH VU================");
                              System.out.println("1:Ca Si");
                              System.out.println("2:Karaoke");
                              System.out.println("3:Trang Tri");
                              int cdv = CauHinh.sc.nextInt();
                              CauHinh.sc.nextLine();
                              switch (cdv) {
                                  case 1 -> {
                                        displaySubList(Arrays.asList(Arrays.asList(QLDV.traCuuDV("Ca si"))));
                                        System.out.println("Nhập ma DV muon thue:");
                                        String maDV=CauHinh.sc.nextLine();
                                        MoiCaSi d= (MoiCaSi) QLDV.tim(maDV);
                                        System.out.println("Nhap So luong bai hat:");
                                        int sobai= CauHinh.sc.nextInt();
                                        d.setSoBaiHat(sobai);
                                        bDV.themDV(d);
                                      break;
                                  }
                                  case 2 -> {
                                      displaySubList(Arrays.asList(Arrays.asList(QLDV.traCuuDV("karaoke"))));
                                      System.out.println("Nhập ma DV muon thue:");
                                      String maDV = CauHinh.sc.nextLine();
                                      Karaoke d = (Karaoke) QLDV.tim(maDV);
                                      System.out.println("Nhap Thoi gian thue");
                                      int thoigian=CauHinh.sc.nextInt();
                                      d.setThoiGianThue(thoigian);
                                      bDV.themDV(d);
                                      break;
                                  }
                                  case 3 -> {
                                      displaySubList(Arrays.asList(Arrays.asList(QLDV.traCuuDV("Trang Tri"))));
                                      System.out.println("Nhập ma DV muon thue:");
                                      String maDV = CauHinh.sc.nextLine();
                                      TrangTri d = (TrangTri) QLDV.tim(maDV);
                                      bDV.themDV(d);
                                      break;
                                  }
                              }
                              ChoThue choThue = new ChoThue(aCuoi, ngay, bDV, amenu, tenBT, type);
                              tamChoThue=choThue;
                              QLCT.themHD(choThue);
                              so--;
                          }
                  }
                      else{
                          ChoThue choThue = new ChoThue(aCuoi, ngay, amenu, tenBT, type);
                              tamChoThue=choThue;
                              QLCT.themHD(choThue);
                      }
                      System.out.println("====Thue Thanh Cong=====");
                       break;
                  }
                  case 2->{
                      tamChoThue.xuatHoaDon();
                      break;
                  }
                  case 3->{
                      int c;
                      do {                          
                          capNhap();
                          c=CauHinh.sc.nextInt();
                          switch (c) {
                              case 1->{
                                  int c1;
                                  do {                                      
                                      capNhapSC();
                                      c1=CauHinh.sc.nextInt();
                                      CauHinh.sc.nextLine();
                                      switch (c1) {
                                          case 1->
                                          {
                                              QLSC.themSC();
                                              break;
                                          }
                                          case 2->{
                                              System.out.println("Nhap Ma SC can xoa:");
                                              String maSC=CauHinh.sc.next();
                                              if(QLSC.xoaSC(maSC))
                                                  System.out.println("Xoa Thanh Cong");
                                              else
                                                  System.out.println("Xoa That Bai!!!!");
                                              break;
                                          }
                                          case 3->{
                                              System.out.println("Nhap Ten Sanh Cuoi Can Tim: ");
                                              String tenSC=CauHinh.sc.nextLine();
                                              displaySubList(Arrays.asList(Arrays.asList(QLSC.traCuuSC(tenSC))));
                                              break;
                                          }
                                          case 4->{
                                              System.out.println("Nhap Khoang suc chua sanh cuoi can tim  (tu...den)");
                                              CauHinh.sc.nextLine();
                                              System.out.print("Tu:");
                                              int tu=CauHinh.sc.nextInt();
                                              System.out.print("Den:");
                                              int den=CauHinh.sc.nextInt();
                                              displaySubList(Arrays.asList(Arrays.asList(QLSC.traCuuSC(tu,den))));
                                              break;
                                          }
                                      }
                                  } while (c1!=5);
                              }
                            case 2->{
                                int c2;
                                do {                                    
                                    capNhapDV();
                                    c2=CauHinh.sc.nextInt();
                                    CauHinh.sc.nextLine();
                                     switch(c2){
                                    case 1->{
                                        System.out.println("=========Them DV=========");
                                        QLDV.themDV();
                                        break;
                                    }
                                    case 2->{
                                        System.out.println("===Nhap Ma DV Can Xoa===");
                                        String maDV= CauHinh.sc.next();
                                        if(QLDV.xoaDV(maDV))
                                            System.out.println("Xoa Thanh Cong");
                                        else
                                            System.out.println("Xoa That Bai");
                                        break;
                                    }
                                    case 3->{
                                        System.out.println("Nhap Ten DV Can tim kiem");
//                                        CauHinh.sc.nextLine();
                                        String tenDV=CauHinh.sc.next();
                                        displaySubList(Arrays.asList(Arrays.asList(QLDV.traCuuDV(tenDV))));
                                        CauHinh.sc.nextLine();
                                    }
                                    case 4->{
                                        displaySubList(Arrays.asList(Arrays.asList(QLDV)));
                                    }
                                }
                                } while (c2!=5);
                            }
                            case 3->{
                                System.out.println("=========THEM MENU=========");
                                q.themMenu();
                                 displaySubList(Arrays.asList(Arrays.asList(q)));
                            }
                          }
                      } while (c!=4);
                      break;
                  }
                  case 4->{
                      System.out.println("Nhap Nam can sap xep: ");
                      String ngayString=CauHinh.sc.nextLine();
                      System.out.println("=====Danh sach tan so thue sanh cuoi=====");
                      QLCT.sapXepSD(ngayString);
                  }
                  case 5->{
                    QLCT.BCDoanhThu();
                  }
              }
        } while (n!=6);

    }
}
