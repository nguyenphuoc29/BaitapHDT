package com.vannht2008110055.lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Float ChieuDai , ChieuRong , DienTich , ChuVi , CanhNhoNhat ;
         System.out.print("nhập chiều dài và chiều rộng hình chữ nhật");
         Scanner input = new Scanner(System.in);
         ChieuDai = input.nextFloat();
         ChieuRong = input.nextFloat();
         DienTich = ChieuDai * ChieuRong;
         ChuVi = (ChieuDai + ChieuRong) *2;
         CanhNhoNhat = Math.min(ChieuDai , ChieuRong);
         System.out.println("Diện tích của hình chữ nhạt là " + DienTich + "\n Chu vi của hình chữ nhật là :"+ ChuVi + "\n Canh nhỏ nhất là : " + CanhNhoNhat);
        
        
    }
    
}
