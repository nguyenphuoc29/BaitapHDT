package com.vannht2008110055.lab2;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int luaChon = 0;
        /*Scanner sc = new Scanner(System.in);
        luaChon = sc.nextInt();*/
        do
        {
            System.out.println("__________Menu__________");
            System.out.println("1.Giải phương trình bậc I");
            System.out.println("2.Giải phương trình bậc II");
            System.out.println("3.Tính tiền điện");
            /*System.out.println("4.Thoát");*/
            System.out.println("Mời bạn chọn các option trên!");
            Scanner sc = new Scanner(System.in);
            luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:gPTbacI();;break;
                case 2:gPTbacII();;break;
                case 3:tienDien();;break;
                /*case 4:  ;;break;*/
            }


        }
        while(luaChon != 0);
    }
    static void gPTbacI()
    {
        float a,b;
        System.out.println("Nhập hệ số a và b:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a == 0)
        {
            if (b == 0)
            {
                System.out.println("Phương trình vô số nghiệm");
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else
        {
            System.out.println("Phương trình có nghiệm:" + -b/a);
        }
    }
    static void gPTbacII()
    {
        float a,b,c;
        double delta,canDelta,x1,x2;
        System.out.println("Nhập hệ số a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if(a == 0)
        {
            if(b == 0)
            {
                if(c == 0)
                {
                    System.out.println("Phương trình có vô số nghiệm");
                }
                else
                {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            else
            {
                System.out.println("Phương trình có nghiệm -b/a =" + -b/a);
            }
        }
        else
        {
            delta = b*b - 4*a*c;
            canDelta = Math.sqrt(delta);
            if(delta == 0)
            {
                System.out.println("Phương trình có nghiệm kép:" + -b/2*a);
            }
            else if(delta < 0)
            {
                System.out.println("Phương trình vô nghiệm");
            }
            else
            {
                System.out.println("Phương trình có hai nghiệm phân biệt");
                System.out.println("x1" + (-b+canDelta)/2*a);
                System.out.println("x2" + (-b-canDelta)/2*a);
            }
        }
    }
    static  void tienDien()
    {
        float soDien;
        double soTien;
        System.out.println("tổng số điện sử dụng trong tháng là : ");
        Scanner bien = new Scanner(System.in);
        soDien = bien.nextFloat();
        if(soDien <= 50){
        soTien = soDien*1000;
        System.out.println("vậy tổng số tiền điện tháng này là : " +soTien);
        }
        else{
            soTien = 50*1000 + (soDien - 50)*1200 ;
            System.out.println("Vậy tổng số tiền điện tháng này là "+soTien);
        }
    }
    
}
