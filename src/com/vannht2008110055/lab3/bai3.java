/*
* ngày tạo: Sep 28, 2021
* tên tác giả: Nguyễn Hoàng Trọng văn
*/
package com.vannht2008110055.lab3;
import java.util.Scanner;
import java.util.Arrays;


public class bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mang = new int[n];
        nhapMang(n,mang);
        Arrays.sort(mang);
        System.out.println("Mảng sau khi sắp xếp");
        xuatMang(n,mang);
        timPhantuNhonhat(n,mang);
        tbcChiahetchoba(n,mang);
    }
    public static void nhapMang(int n,int mang[]){ // nhập Mảng
        for(int i = 0; i < n; i++){
            System.out.println("Nhập phần tử thứ "+(i + 1)+ " của mảng :");
            Scanner sc = new Scanner(System.in);
            mang[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int n,int mang[]){// Xuất mảng
        for(int i = 0; i < n; i++){
            System.out.println("Phần tử thứ "+(i + 1)+" của mảng : " + mang[i]);
        }
    }
    public static void timPhantuNhonhat(int n,int mang[]){//tìm phần tử
        int min = mang[0];
        for(int i = 0; i < n; i++){
            if(mang[i] < min ){
                min = mang[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " +min);
    }
    public static void tbcChiahetchoba(int n,int mang[]){//trung bình các số chia hết chia 3
        float tong = 0 , dem = 0;
        for(int i = 0; i < n; i++){
            if(mang[i] % 3 == 0){
                tong += mang[i];
                dem  += 1;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3 là: " +(tong/dem));
    }

}
    

