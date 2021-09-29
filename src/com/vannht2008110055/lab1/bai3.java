package com.vannht2008110055.lab1;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Float Canh , TheTich;
        System.out.print("Nhập cạnh khối lập phương");
        Scanner input = new Scanner(System.in);
        Canh = input.nextFloat();
        TheTich = Canh * Canh * Canh ;
        System.out.println("Thể tích khối lập phương là :" +TheTich);
        
    }
    
}
