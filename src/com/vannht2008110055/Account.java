/*
*Created date: Oct 02, 2021
*Author: Mai Thanh Long
*/
package com.longmt1848103023.Lab4;

public class Account {
    int number_account;
    int number_balance;
    int stk;
    int tientrongtk;
    Account(int a, int b, int c, int d){
        number_account = a;
        number_balance = b;
        stk = c;
        tientrongtk = d;
    }
    void showdata(){
        System.out.println("Number account: "+number_account);
        System.out.println("Number account: "+number_balance+"K");
    }
    void deposit(int ammount){
        System.out.println("Number account: "+number_account);
        System.out.println("Number_balance: "+number_balance+"K");
        number_balance += ammount;
        System.out.println("Số tiền vừa chuyển vào: "+ammount+"K");
        System.out.println("Number account: "+number_account);
        System.out.println("Thành tiền: "+number_balance+"K");
   }
   void withdraw(int amount){
       System.out.println("Number account: "+number_account);
       System.out.println("Number_balance: "+number_balance+"K");
       number_balance -=amount;
       System.out.println("Số tiền vừa rút ra: "+amount+"K");
       System.out.println("Number account: "+number_account);
       System.out.println("Thành tiền: "+number_balance+"K");
   }
   void chuyentien (int tien){
       System.out.println("Number_balance lúc đầu: "+number_balance+"K");
       number_balance -=tien;
       System.out.println("Number_account: "+number_account);
       System.out.println("Number_balance sau khi chuyển: "+number_balance+"K");
       int tienmoi = tientrongtk + tien;
       System.out.println("Số tiền chuyển: "+tien+"K");
       System.out.println("Số tài khoản đc nhận tiền: "+stk);
       System.out.println("Số tiền trong tài khoản lúc đầu: "+ tientrongtk+"K");
       System.out.println("Thành tiền sau khi nhận tiền: "+tienmoi+"K");
   }
   void dongtiendien (int tiendien){
       System.out.println("Number_account: "+number_account);
       System.out.println("Number_balance: "+number_balance+"K");
       System.out.println("Số tiền điện: "+tiendien+"K");
       number_balance -= tiendien;
       System.out.println("Number_account: "+number_account);
       System.out.println("Number_balance sau khi đóng tiền điện: "+number_balance+"K");
   }
   void vayno (int tienno){
        System.out.println("Number_account: "+number_account);
        System.out.println("Number_balance: "+number_balance+"K");
        System.out.println("Số tiền vay ngân hàng: "+tienno+"K");
        number_balance +=tienno;
        System.out.println("Number_account: "+number_account);
        System.out.println("Number_balance sau vay: "+number_balance+"K");
        System.out.println("Số tiền đang thiếu ngân hàng: "+tienno+"K");
        float tientra = (float) (tienno*0.001) + tienno ;
        System.out.println("Số tiền bạn phải trả với lãi suất 0,1%: "+tientra+"K");
   }
}
