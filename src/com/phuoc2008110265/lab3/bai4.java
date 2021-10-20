/*
* ngày tạo: Sep 29, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab3;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
    //Nhập thông tin sinh viên
        System.out.print("Nhập số lượng sinh viên : ");
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        String[] MangTenSinhVien = new String[n];
        float[] MangDiemSinhVien = new float[n];
        NhapMangTenvaDiem(n, MangTenSinhVien, MangDiemSinhVien);
        System.out.println("====================================");
        XuatMangTenVaDiem(n, MangTenSinhVien, MangDiemSinhVien);
        System.out.println("====================================");
        XetHocLucSinhVien(n, MangTenSinhVien, MangDiemSinhVien);

    }
    public static void NhapMangTenvaDiem(int n ,String arr[], float arr1[]){
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhập tên của sinh viên số thứ tự " + (i+1) + " : ");
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextLine();
            System.out.print("Nhập điểm của sinh viên số thứ tự " + (i+1) + " : ");
            arr1[i] = input.nextFloat();
        }
    }
    
    public static void XuatMangTenVaDiem(int n ,String arr1[], float arr[]){
        for(int i = 0 ; i < n ; i++){
            System.out.println("Tên của sinh viên số thứ tự " + (i+1) + " là : " + arr1[i]);
            System.out.println("Điểm của sinh viên số thứ tự " + (i+1) + " là : " + arr[i]);
            
        }
    }
    public static void XetHocLucSinhVien(int n,String A[] , float B[]){
        for(int i=0;i<n;i++) {
			if(B[i]<5) {
				System.out.println("Tên : "+A[i]+"\n Điểm: "+B[i]+"\nHọc lực: Yếu");
			}
			if(B[i]>5 && B[i]<6.5) {

				System.out.println("Tên : "+A[i]+"\n Điểm: "+B[i]+"\nHọc lực: Trung bình ");
			}
			if(B[i]>=6.5 && B[i]<7.5) {

				System.out.println("Tên : "+A[i]+"\n Điểm: "+B[i]+"\nHọc lực: Khá");
			}
			if(B[i]>=7.5 && B[i]<9) {

				System.out.println("tên : "+A[i]+"\n Điểm: "+B[i]+"\nHọc lực: Giỏi");
			}
			if(B[i]>=9) {

				System.out.println("Tên : "+A[i]+"\n Điểm: "+B[i]+"\nHọc lực: Xuất sắc");
			}
		} 
    }

    }
    

