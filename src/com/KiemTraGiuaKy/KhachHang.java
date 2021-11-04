/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : nguyễn thành phước
*/
package KiemTra;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double giaTriHoaDon;


    
    public KhachHang(String hoTen, String diaChi, String tenCongTy, double giaTriHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.giaTriHoaDon = giaTriHoaDon;
    }
    public String getTenCongTy() {
        return tenCongTy;
    }
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    public double getGiaTriHoaDon() {
        return giaTriHoaDon;
    }
    public void setGiaTriHoaDon(double giaTriHoaDon) {
        this.giaTriHoaDon = giaTriHoaDon;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"Gia Tri hoa Don"+this.giaTriHoaDon;
    }

    
}
