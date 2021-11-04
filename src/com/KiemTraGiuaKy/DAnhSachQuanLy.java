
/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : nguyễn thành phước
*/
package KiemTra;

import java.util.ArrayList;
import java.util.List;

public class DAnhSachQuanLy {
    private List<Nguoi>ds;

    public DAnhSachQuanLy() {
        this.ds = new ArrayList<>();
    }
    public void addDs(Nguoi nguoi) {
        this.ds.add(nguoi);
    }
    public void showDs() {
        this.ds.forEach(o -> System.out.println(o.toString()));
    }


    
}
