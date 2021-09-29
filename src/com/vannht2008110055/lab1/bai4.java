package com.vannht2008110055.lab1;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        float a,b,c,delta;
        double canDelta;
        System.out.println("Nhập hệ số a,b,c của phương trình bậc 2 : ");
        Scanner bien = new Scanner(System.in);
        a = bien.nextFloat();
        b = bien.nextFloat();
        c = bien.nextFloat();
        delta = b*b - 4*a*c ;
        canDelta = Math.sqrt(delta);
        System.out.println("vậy delta có kết quả là : " + delta);
        System.out.println("Căn của delta có kết quả là :" + canDelta);
    }
    
}
