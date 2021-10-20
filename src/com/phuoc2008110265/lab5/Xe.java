package lab5;

public class Xe {
    String tenChuSoHuuXe,hangSanXuat,loai,giayPhep;
    int dungTichxylanh,bienSoxe;
    void getName(String name){
        tenChuSoHuuXe = name;
    }
    void getLicense(String x){
        giayPhep = x;
    }
    void getPublisher(String x){
        hangSanXuat = x;
    }

    void getEngineType(int x){
        dungTichxylanh = x;
    }
    void getLicensePlate(int x){
        bienSoxe = x;
    }
        void showData(){
        System.out.println("Tên chủ sở hữu: "+tenChuSoHuuXe);
        System.out.println("Giấy phép lái xe loại: "+giayPhep);
        System.out.println("Dòng: "+loai);
        System.out.println("Dung tích xăng: "+dungTichxylanh+" cc");
        System.out.println("Hãng sản xuất: "+hangSanXuat);
        System.out.println("Biển số xe:"+bienSoxe);
    }
    Xe(String x){
        loai = x;
    }
}
