/*
*Created date: Oct 02, 2021
*Author: Nguyễn Thành Phước
*/


import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account account;
        System.out.println("Nhập số, chỉ hành động bạn muốn làm:");
        System.out.println("1. Xem thông tin");
        System.out.println("2. Xem thông tin số tiền đã chuyển vào tài khoản");
        System.out.println("3. Xem thông tin số tiền sau khi rút");
        System.out.println("4. Xem thông tin chuyển tiền");
        System.out.println("5. Xem thông tin đóng tiền điện");
        System.out.println("6. Xem thông tin vay nợ");
        System.out.println("-------------");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        switch (num) {
            case 1:
                account = new Account(123, 700, num, num);
                account.showdata();
                break;
            case 2:
                account = new Account(123, 700, num, num);
                account.deposit(500);
                break;
            case 3:
                account = new Account(123, 700, num, num);
                account.withdraw(200);
                break;
            case 4:
                account = new Account(123, 700, 235, 600);
                account.chuyentien(300);
                break;
            case 5:
                account = new Account(123, 700, num, num);
                account.dongtiendien(500);
                break;
            case 6:
                account = new Account(123, 700, num, num);
                account.vayno(300);
                break;
            default:
                break;
        }    
    }
}