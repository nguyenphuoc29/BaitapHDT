/*Nguyen Thanh Phuoc
MSSV 2008110265 LOP K14DCLT-IOT*/
package QuanLyKho;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;




public class GiaoDienUI extends JFrame implements ActionListener{
	JComboBox<LoaiHang>cboLoaiHang;
    JList<HangHoa>listHangHoa;
    JTextField txtMa,txtTen,txtNhap,txtSoTonKho,txtGia;
    JLabel lblSoTonKho,lblNgayNhap;
    JButton btnThem,btnXoa,btnThoat,btnSua,btnTimKiem,btnThongKe;
    ArrayList<HangHoa>dsHangHoaTheoLoai;
    ArrayList<LoaiHang>dsLoaiHang;
    Vector<HangHoa>dsTam=new Vector<HangHoa>();
    Vector<HangHoa>dsTongHangHoas=new Vector<HangHoa>();
    LoaiHang lHangSelecTed=null;
    HangHoa hhSelecTed=null;
    
    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

	
	public GiaoDienUI(String title){
        super(title);
        addControls();
        addEvents();
        fakeDaTa();
    }
	private void addEvents() {
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnThoat.addActionListener(this);
		btnThongKe.addActionListener(this);
		btnTimKiem.addActionListener(this);
		btnXoa.addActionListener(this);
		cboLoaiHang.addActionListener(this);
		
		listHangHoa.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(listHangHoa.getSelectedIndex()==-1) return;
				hhSelecTed=listHangHoa.getSelectedValue();
				txtMa.setText(hhSelecTed.getMa());
				txtTen.setText(hhSelecTed.getTen());
				txtGia.setText(String.valueOf(hhSelecTed.getGiaNhap()));
				txtSoTonKho.setText(String.valueOf(hhSelecTed.getsLTonKho()));
				txtNhap.setText(sdf.format(hhSelecTed.getNgayNhap()));
				
				
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(cboLoaiHang)) {
			lHangSelecTed= (LoaiHang)cboLoaiHang.getSelectedItem();
			listHangHoa.setListData(lHangSelecTed.getHangHoa());
		}
		if(e.getSource().equals(btnThoat)) {
			System.exit(0);
		}
		if(e.getSource().equals(btnThem)) {
			try {
				HangHoa hangHoa=new HangHoa(txtMa.getText(), txtTen.getText(),
												Double.parseDouble(txtGia.getText()), sdf.parse(txtNhap.getText()),
												Integer.parseInt(txtSoTonKho.getText()));
				//if(lHangSelecTed!=null) {
					//if(lHangSelecTed.themHang(hangHoa)) {
						boolean k=true;
						for(LoaiHang lh:dsLoaiHang) {
							if(lh.timKiem(txtMa.getText())!=null) {
								k=false;
							}
						}
						if(k==true) {
							lHangSelecTed.themHang(hangHoa);
							listHangHoa.setListData(lHangSelecTed.getHangHoa());
							txtGia.setText(null);
							txtMa.setText(null);
							txtNhap.setText(null);
							txtSoTonKho.setText(null);
							txtTen.setText(null);
							txtMa.requestFocus();
							JOptionPane.showMessageDialog(null, "Thêm Thành Công");
						}
					//}
					else {
	    				JOptionPane.showMessageDialog(null, "Ma Bị Trùng");
	    				txtMa.setText(null);
	    				txtMa.requestFocus();
	    			}
				//}
			} catch (Exception e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e2.toString());
			}
		}
		if(e.getSource().equals(btnXoa)) {
			String maHang= JOptionPane.showInputDialog("Nhập mã Hàng cần xóa:");
			for(LoaiHang lh:dsLoaiHang) {
				if(lh.xoaHang(maHang)==true) {
					listHangHoa.setListData(lh.getHangHoa());
					JOptionPane.showMessageDialog(null, "Xóa Thành Công");
					txtGia.setText(null);
					txtMa.setText(null);
					txtNhap.setText(null);
					txtSoTonKho.setText(null);
					txtTen.setText(null);
					txtMa.requestFocus();
				}
			}
			
		}
		if(e.getSource().equals(btnSua)) {
			String maHang = null;
			if(btnSua.getText().equalsIgnoreCase("Sửa")) {
				maHang= JOptionPane.showInputDialog("Nhập mã Hàng cần tìm:");
				boolean k=false;
			for(LoaiHang lh:dsLoaiHang) {
				if(lh.timKiem(maHang)!=null) {
					k=true;
					lHangSelecTed=lh;
					HangHoa hangtim= lh.timKiem(maHang);
					cboLoaiHang.setSelectedItem(lh);
					listHangHoa.setListData(lh.getHangHoa());
					listHangHoa.setSelectedIndex(lh.getHangHoa().indexOf(hangtim));
					txtMa.setText(hangtim.getMa());
					txtTen.setText(hangtim.getTen());
					txtGia.setText(String.valueOf(hangtim.getGiaNhap()));
					txtSoTonKho.setText(String.valueOf(hangtim.getsLTonKho()));
					txtNhap.setText(sdf.format(hangtim.getNgayNhap()));
					txtMa.setEditable(false);					
					btnSua.setText("Cập Nhật");
					btnTimKiem.setText("Hủy");
					btnThem.setEnabled(false);
					btnThongKe.setEnabled(false);
					btnXoa.setEnabled(false);
				}
				
			}
			if(k==false) JOptionPane.showMessageDialog(null, "Không tồn tại mã hàng trên");
			}
			else if (btnSua.getText().equalsIgnoreCase("Cập Nhật")) {
				try {
					if(lHangSelecTed.capNhap(txtMa.getText(), txtTen.getText(),
													Double.parseDouble(txtGia.getText()), sdf.parse(txtNhap.getText()),
													Integer.parseInt(txtSoTonKho.getText())))
					txtMa.setEditable(true);
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}					
				btnSua.setText("Sửa");
				btnTimKiem.setText("Tìm Kiếm");
				btnThem.setEnabled(true);
				btnThongKe.setEnabled(true);
				btnXoa.setEnabled(true);
			}
		}
		if(e.getSource().equals(btnTimKiem)) {
			String key;
			int chon=0;
			if(btnTimKiem.getText().equals("Tìm Kiếm")) {
					key= JOptionPane.showInputDialog("Nhập 1 để tìm theo khoẳng giá Hoặc 2 để tìm theo khoảng thời gian:");
					chon=Integer.parseInt(key);
					boolean k=false;
					for(LoaiHang lh:dsLoaiHang) {
						for(HangHoa h:lh.getHangHoa()) {
							dsTongHangHoas.add(h);
						}
					
						
						}
				
			}
			if(chon==1) {
						
				String a= JOptionPane.showInputDialog("Nhập Giá từ:");
				String b= JOptionPane.showInputDialog("Đến:");
				
						for(HangHoa hh:dsTongHangHoas) {
							if(hh.getGiaNhap()>= Double.parseDouble(a) 
									&& hh.getGiaNhap()<= Double.parseDouble(b)) {
								dsTam.add(hh);
								
							}
						}
						if(dsTam.size()!=0) {
							listHangHoa.setListData(dsTam);
							JOptionPane.showMessageDialog(null, dsTam.size());
						}
						else {
							JOptionPane.showMessageDialog(null, "Không tìm thấy hàng hóa nào");
						}
						
					}
			else if(chon==2) {
				String c=JOptionPane.showInputDialog("Từ NGày:");
				String d=JOptionPane.showInputDialog("Đến NGày:");
				
				for(HangHoa hh:dsTongHangHoas) {
					try {
						if(hh.getNgayNhap().compareTo(sdf.parse(c))>=0
								&& hh.getNgayNhap().compareTo(sdf.parse(d))<=0) {
							dsTam.add(hh);
							
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(dsTam.size()!=0) {
					listHangHoa.setListData(dsTam);
					JOptionPane.showMessageDialog(null, "/danh sách được hiện trên list:"+dsTam.size());
				}
				else {
					JOptionPane.showMessageDialog(null, "Không tìm thấy hàng hóa nào");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Không có chức năng này. mời thao tác lại");
			}
				}
		
		if(e.getSource().equals(btnThongKe)) {
			int tong=0;
			int i=0,j=0;
			String ten[]=new String[10];
			int soluong[]=new int[10];
			double tongGiaNhap=0;
			for(LoaiHang lh:dsLoaiHang) {
				tong+=lh.tongSoLuong();
				ten[j]=lh.getTenLoai();
				soluong[i]=lh.tongSoLuong();
				i++;
				j++;
			}
			for(LoaiHang lh:dsLoaiHang) {
				tongGiaNhap+=lh.tongGiaTri();
			}
			JOptionPane.showMessageDialog(null, "Tổng Số Lượng Hàng Hóa: "+tong
												+"\nTổng Giá Trị Nhập Kho: "+tongGiaNhap
												+"\n"+ten[0]+": "+soluong[0]+"\n"
												+ten[1]+": "+soluong[1]+"\n"
												+ten[2]+": "+soluong[2]);
			
		}
			
		}
		
	
	
	
	private void addControls() {
		Container con=getContentPane();
        JPanel pnMain= new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        con.add(pnMain);

        JPanel pnLoaiHang=new JPanel();
        pnLoaiHang.setLayout(new FlowLayout());
        JLabel lblChonLoaiHang=new JLabel("Chọn Loại Hàng:");
        cboLoaiHang=new JComboBox<LoaiHang>();
        cboLoaiHang.setPreferredSize(new Dimension(200, 25));
        pnLoaiHang.add(lblChonLoaiHang);
        pnLoaiHang.add(cboLoaiHang);
        pnMain.add(pnLoaiHang);

        JPanel pnDanhSachVaThongTin=new JPanel();
        pnDanhSachVaThongTin.setLayout(new GridLayout(1,2));
        pnMain.add(pnDanhSachVaThongTin);

        JPanel pnDanhSach=new JPanel();
        pnDanhSachVaThongTin.add(pnDanhSach);
        pnDanhSach.setLayout(new BorderLayout());
        listHangHoa=new JList<HangHoa>();
        JScrollPane sc =new JScrollPane(listHangHoa,
                                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                                      JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pnDanhSach.add(sc,BorderLayout.CENTER);
        Border bdDanhSach=BorderFactory.createLineBorder(Color.RED);
        TitledBorder titleDS=new TitledBorder(bdDanhSach,"Danh Sách Hàng Hóa");
        titleDS.setTitleJustification(TitledBorder.CENTER);
        titleDS.setTitleColor(Color.RED);
        pnDanhSach.setBorder(titleDS);


        JPanel pnThongTin=new JPanel();
        pnDanhSachVaThongTin.add(pnThongTin);
        pnThongTin.setLayout(new BoxLayout(pnThongTin,BoxLayout.Y_AXIS));
        JPanel pnMa=new JPanel();
        pnThongTin.add(pnMa);
        JLabel lblMa=new JLabel("MÃ:");
        txtMa=new JTextField(20);
        pnMa.add(lblMa);
        pnMa.add(txtMa);

        JPanel pnTen=new JPanel();
        pnThongTin.add(pnTen);
        JLabel lblTen=new JLabel("TÊN:");
        txtTen=new JTextField(20);
        pnTen.add(lblTen);
        pnTen.add(txtTen);

        
        JPanel pnGia=new JPanel();
        pnThongTin.add(pnGia);
        JLabel lblGia=new JLabel("GIÁ:");
        txtGia=new JTextField(20);
        pnGia.add(lblGia);
        pnGia.add(txtGia);

        JPanel pnSoTonKho=new JPanel();
        pnThongTin.add(pnSoTonKho);
        lblSoTonKho=new JLabel("Số Tồn Kho:");
        txtSoTonKho=new JTextField(20);
        pnSoTonKho.add(lblSoTonKho);
        pnSoTonKho.add(txtSoTonKho);
        
        JPanel pnNhap=new JPanel();
        pnThongTin.add(pnNhap);
        lblNgayNhap=new JLabel("Ngày Nhập Kho:");
        txtNhap=new JTextField(20);
        pnNhap.add(lblNgayNhap);
        pnNhap.add(txtNhap);

        Border bdThongTin=BorderFactory.createLineBorder(Color.BLUE);
        TitledBorder titleTT=new TitledBorder(bdThongTin,"Thông Tin");
        titleTT.setTitleJustification(TitledBorder.CENTER);
        titleTT.setTitleColor(Color.RED);
        pnThongTin.setBorder(titleTT);

        lblMa.setPreferredSize(lblNgayNhap.getPreferredSize());
        lblTen.setPreferredSize(lblNgayNhap.getPreferredSize());
        lblSoTonKho.setPreferredSize(lblNgayNhap.getPreferredSize());
        lblGia.setPreferredSize(lblNgayNhap.getPreferredSize());


        JPanel pnButTon=new JPanel();
        pnMain.add(pnButTon);
        pnButTon.setLayout(new FlowLayout(FlowLayout.RIGHT));
        btnThem=new JButton("Thêm");
        btnThoat=new JButton("Thoát");
        btnXoa=new JButton("Xóa");
        btnSua=new JButton("Sửa");
        btnThongKe=new JButton("Thống Kê");
        btnTimKiem=new JButton("Tìm Kiếm");
        pnButTon.add(btnThem);
        pnButTon.add(btnXoa);
        pnButTon.add(btnSua);
        pnButTon.add(btnTimKiem);
        pnButTon.add(btnThongKe);
        pnButTon.add(btnThoat);
       

	}
	public void fakeDaTa(){
        dsLoaiHang=new ArrayList<LoaiHang>();
        LoaiHang dienMay=new LoaiHang();
        dienMay.setMaLoai("l1");
        dienMay.setTenLoai("Điện Máy");

        LoaiHang thucPham=new LoaiHang();
        thucPham.setMaLoai("l2");
        thucPham.setTenLoai("Thực Phẩm");

        LoaiHang sanhSu=new LoaiHang();
        sanhSu.setMaLoai("l3");
        sanhSu.setTenLoai("Sành Sứ");

        dsLoaiHang.add(dienMay);
        dsLoaiHang.add(sanhSu);
        dsLoaiHang.add(thucPham);

        
        dienMay.themHang(new HangHoa("ms1", "Tủ Lạnh", 9000, new Date(2021-1900, 6, 26), 9));
        dienMay.themHang(new HangHoa("ms2", "Máy Giặt", 8000, new Date(2021-1900, 5, 28), 10));
        dienMay.themHang(new HangHoa("ms3", "Điều Hòa", 7000, new Date(2021-1900, 6, 29), 12));
        dienMay.themHang(new HangHoa("ms4", "Nồi Cơm Điện", 25000, new Date(2021-1900, 6, 30), 12));
        
        thucPham.themHang(new HangHoa("tp1", "Cá Khô", 10000, new Date(2021-1900, 6, 22), 9));
        thucPham.themHang(new HangHoa("tp2", "Mực Khô", 6000, new Date(2021-1900, 6, 23), 9));
        thucPham.themHang(new HangHoa("tp3", "Bò Khô", 900, new Date(2021-1900, 6, 24), 9));
        thucPham.themHang(new HangHoa("tp4", "Bánh Mì", 900, new Date(2021-1900, 6, 21), 9));
        
        sanhSu.themHang(new HangHoa("ss1", "Bình Hoa", 6000, new Date(2021-1900, 6, 25), 9));
        sanhSu.themHang(new HangHoa("ss2", "Bát Tô", 9000, new Date(2021-1900, 6, 25), 9));
        sanhSu.themHang(new HangHoa("ss3", "Đĩa", 3000, new Date(2021-1900, 6, 24), 9));
        sanhSu.themHang(new HangHoa("ss4", "Ấm Trà", 3000, new Date(2021-1900, 6, 23), 9));

        for(LoaiHang lH:dsLoaiHang){
            cboLoaiHang.addItem(lH);
        }



    }
	
	
	public void showWindow()
	{
		this.setSize(700,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
		txtMa.requestFocus();
	}
	
	

}
