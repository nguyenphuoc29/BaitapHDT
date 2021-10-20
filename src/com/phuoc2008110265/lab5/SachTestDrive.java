package lab5;

public class SachTestDrive {
    public static  void main(String[] args) {
        Sach sach1 = new Sach(40);
        sach1.getNhaXuatBan("Fujimi Fantasia Bunko");
        sach1.getNamXuatBan(2021);
        sach1.getTheLoai("Light Novel");
        sach1.getGiaNhap(98000);
        sach1.getGiaXuat(108000);
        sach1.getSoLuong(49);
        sach1.showSach();
    }
}