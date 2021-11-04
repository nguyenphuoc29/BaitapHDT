/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : nguyễn thành phước
*/
package KiemTra;

public class HocVien extends Nguoi{
    private float diemMonHoc1;
    private float diemMonHoc2;

    
    public HocVien(String hoTen, String diaChi, float diemMonHoc1, float diemMonHoc2) {
        super(hoTen, diaChi);
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }
    public float getDiemMonHoc1() {
        return diemMonHoc1;
    }
    public void setDiemMonHoc1(float diemMonHoc1) {
        this.diemMonHoc1 = diemMonHoc1;
    }
    public float getDiemMonHoc2() {
        return diemMonHoc2;
    }
    public void setDiemMonHoc2(float diemMonHoc2) {
        this.diemMonHoc2 = diemMonHoc2;
    }
    public float diemTB(){
        float TB=(this.diemMonHoc1+this.diemMonHoc2)/2;
        return TB;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()
                                +"\nDiem Mon hoc 1:"+diemMonHoc1
                                +"\nDiem Mon Hoc 2: "+diemMonHoc2
                                +"\nDiem Trung Binh: "+diemTB();

    }

    
}
