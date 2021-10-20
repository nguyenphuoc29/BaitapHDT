package com.vannht2008110055.lab3;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("nhập một số bất kì");
        Scanner bien = new Scanner(System.in);
        int n = bien.nextInt();
        if(soNguyenTo(n)){
            System.out.println("là số nguyên tố " + n);

        } else {
            System.out.println("không phải là số nguyên tố" + n);
        }

    }
    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i=2; i < n-1; i++){ // N là số nhập từ bàn phím 1if(N % i == 0){ 
            if (n % i == 0){
                return false;
            }
           
        }
        return true;

    }
    
}
