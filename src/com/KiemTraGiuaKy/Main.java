/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : nguyễn thành phước
*/
package KiemTra;

import java.util.Scanner;


public class Main {

     public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        DAnhSachQuanLy dsQL=new DAnhSachQuanLy();
        while(true){
            System.out.println("Chuong Trinh Quan Ly TestDrive");
            System.out.println("Enter 1; Them mot nguwoif:");
            System.out.println("Hien 2 Thi danh sach:");
            System.out.println("Enter 0: thoat:");
            String k=scanner.nextLine();
            switch(k){
                case "1":{
                    System.out.println("Enter a; Them hoc vien:");
                    System.out.println("Enter b; Them mot nhan vien:");
                    System.out.println("Enter c; Them mot khach hang:");
                    String type=scanner.nextLine();
                    switch(type){
                        case "b":{
                        System.out.print("Nhap ten: ");
                        String ten = scanner.nextLine();
                        System.out.print("Nhap he so luong");
                        Float hsl = scanner.nextFloat();
                        System.out.print("Nhap Dia chi: ");
                        String diachi = scanner.nextLine();
                        Nguoi nhanvien = new NhanVien(ten, diachi, hsl);
                        dsQL.addDs(nhanvien);
                        System.out.println(nhanvien.toString());
                        break;}

                        case "a":{
                        System.out.print("Nhap ten: ");
                        String tenn = scanner.nextLine();
                        System.out.print("Nhap diem mon 1:");
                        Float dm1 = scanner.nextFloat();
                        System.out.print("Nhap diem mon 2:");
                        Float dm2 = scanner.nextFloat();
                        System.out.print("Nhap Dia chi: ");
                        String diachii = scanner.nextLine();
                        Nguoi hocvien = new HocVien(tenn,diachii, dm1, dm2);
                        dsQL.addDs(hocvien);
                        System.out.println(hocvien.toString());
                        break;}

                        case "c":{
                        System.out.print("Nhap ten: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhap gia tri hoa don:");
                        Float hd = scanner.nextFloat();
                        System.out.print("Nhap ten cong ty:");
                        String tencty = scanner.nextLine();
                        System.out.print("Nhap Dia chi: ");
                        String diachiii = scanner.nextLine();
                        Nguoi khachhang= new KhachHang(name, diachiii, tencty, hd);
                        dsQL.addDs(khachhang);
                        System.out.println(khachhang.toString());
                        break;}


                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;


                    }
                    case "2": {
                        dsQL.showDs();
                        break;
                    }
                    case "0": {
                        return;
                    }
                    default:
                        System.out.println("Invalid");
                        continue;
    

                
            
                }
        
    }
    
}}

