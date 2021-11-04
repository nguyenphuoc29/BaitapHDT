
/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : nguyễn thành phước
*/
package KiemTra;

public class NhanVien extends Nguoi{
    private float heSoLuong;

    public NhanVien(String hoTen, String diaChi, float heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public float tinhLuong(){
        float luong=this.heSoLuong*1500000;
        return luong;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()
                            +"\nHe So Luong: "+heSoLuong
                            +"\nLhuowng"+tinhLuong();
    }

    
}
