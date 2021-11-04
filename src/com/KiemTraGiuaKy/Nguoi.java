/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : nguyễn thành phước
*/
package KiemTra;

public class Nguoi {
    protected String hoTen;
    protected String diaChi;



    public Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ten:"+this.hoTen+"Dia chi: "+this.diaChi;
    }


    
    
}
