package com.vannht2008110055.lab2;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        float a,b;
        double nghiemX;
        System.out.println("Nhập hệ số a và b");
        Scanner bien = new Scanner(System.in);
        a = bien.nextFloat();
        b = bien.nextFloat();
        if( a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phương trình vô sô nghiệm");

            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else
        {
            nghiemX = -b/a;
            System.out.println("Phương trình có nghiệm X:" +nghiemX);
        
    }
    
}
}