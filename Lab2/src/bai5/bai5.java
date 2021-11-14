/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minhm
 */
class Tailieu {

    String maTaiLieu;
    String tenNhaXuatBan;
    int soBanPhatHanh;

    public Tailieu() {
    }

    public Tailieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

}

class Bao extends Tailieu {

    Date ngayPhatHanh;

    public Bao() {
    }

    public Bao(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(Date ngayPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Date getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(Date ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

}

class Tapchi extends Tailieu {

    int soPhatHanh;
    int thangPhatHanh;

    public Tapchi() {
    }

    public Tapchi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public Tapchi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

}

class Sach extends Tailieu {

    private String tenTacGia;
    private String tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTacGia, String tenSach, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public Sach(String tenTacGia, String tenSach, int soTrang, String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

}

class QuanLyTV {

    private ArrayList<Tailieu> taiLieus;
    private Scanner reader;

    public QuanLyTV() {
        taiLieus = new ArrayList<>();
        reader = new Scanner(System.in);
    }

    public Sach taoMoiSach() {
        Sach s = new Sach();
        System.out.println("Mã tài liệu: ");
        s.setMaTaiLieu(reader.nextLine());
        System.out.println("Tên nhà xuất bản: ");
        s.setTenNhaXuatBan(reader.nextLine());
        System.out.println("Số bản phát hành: ");
        s.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Tên tác giả: ");
        s.setTenTacGia(reader.nextLine());
        System.out.println("Tên sách: ");
        s.setTenSach(reader.nextLine());
        System.out.println("Số trang: ");
        s.setSoTrang(Integer.parseInt(reader.nextLine()));
        return s;
    }

    public Tapchi taoMoiTapChi() {
        Tapchi tapChi = new Tapchi();
        System.out.println("Mã tài liệu: ");
        tapChi.setMaTaiLieu(reader.nextLine());
        System.out.println("Tên nhà xuất bản: ");
        tapChi.setTenNhaXuatBan(reader.nextLine());
        System.out.println("Số bản phát hành: ");
        tapChi.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Số phát hành: ");
        tapChi.setSoPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Tháng phát hành: ");
        tapChi.setThangPhatHanh(Integer.parseInt(reader.nextLine()));
        return tapChi;
    }

    public Bao taoMoiBao() {
        Bao bao = new Bao();
        System.out.println("Mã tài liệu: ");
        bao.setMaTaiLieu(reader.nextLine());
        System.out.println("Tên nhà xuất bản: ");
        bao.setTenNhaXuatBan(reader.nextLine());
        System.out.println("Số bản phát hành: ");
        bao.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
        System.out.println("Ngày phát hành: ");
        bao.setNgayPhatHanh(convertStringToDate(reader.nextLine()));
        return bao;
    }

    private Date convertStringToDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(ddMMyyyy);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyTV.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void nhapDanhSachTaiLieu() {
        System.out.println("Nhập 1 - Tạo mới sách");
        System.out.println("Nhập 2 - Tạo mới tạp chí");
        System.out.println("Nhập 3 - Tạo mới báo");
        System.out.println("Nhập 4 - Kết thúc");
        int selectedValue;
        do {
            System.out.println("Bạn chọn: ");
            selectedValue = Integer.parseInt(reader.nextLine());
            switch (selectedValue) {
                case 1:
                    taiLieus.add(taoMoiSach());
                    break;
                case 2:
                    taiLieus.add(taoMoiTapChi());
                    break;
                case 3:
                    taiLieus.add(taoMoiBao());
                    break;
            }
        } while (selectedValue != 4);
    }

    private void xuatThongTin(Tailieu taiLieu) {
        System.out.println("Mã tài liệu: " + taiLieu.getMaTaiLieu());
        System.out.println("Tên nhà xuất bản: " + taiLieu.getTenNhaXuatBan());
        System.out.println("Số bản phát hành:" + taiLieu.getSoBanPhatHanh());
        if (taiLieu instanceof Sach) {
            Sach sach = (Sach) taiLieu;
            System.out.println("Tên tác giả: " + sach.getTenTacGia());
            System.out.println("Tên sách: " + sach.getTenSach());
            System.out.println("Số trang: " + sach.getSoTrang());
        } else {
            if (taiLieu instanceof Tapchi) {
                Tapchi tapChi = (Tapchi) taiLieu;
                System.out.println("Số phát hành: " + tapChi.getSoPhatHanh());
                System.out.println("Tháng phát hành:" + tapChi.getThangPhatHanh());
            } else {
                Bao bao = (Bao) taiLieu;
                System.out.println("Ngày phát hành"
                        + convertDateToString(bao.getNgayPhatHanh()));
            }
        }
    }

    private String convertDateToString(Date ngayPhatHanh) {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayPhatHanh);
    }

    public void xuatDanhSachTaiLieu() {
        for (Tailieu taiLieu : taiLieus) {
            xuatThongTin(taiLieu);
        }
    }

    public void timTheoLoai(String loai) {
        if (loai.equalsIgnoreCase("Sach")) {
            for (Tailieu taiLieu : taiLieus) {
                if (taiLieu instanceof Sach) {
                    xuatThongTin(taiLieu);
                }
            }
        } else {
            if (loai.equalsIgnoreCase("Tap Chi")) {
                for (Tailieu taiLieu : taiLieus) {
                    if (taiLieu instanceof Tapchi) {
                        xuatThongTin(taiLieu);
                    }
                }
            } else {
                for (Tailieu taiLieu : taiLieus) {
                    if (taiLieu instanceof Bao) {
                        xuatThongTin(taiLieu);
                    }
                }
            }
        }
    }

    public void timGanDungTheoTenSach(String str) {
        for (Tailieu taiLieu : taiLieus) {
            if (taiLieu instanceof Sach) {
                Sach sach = (Sach) taiLieu;
                if (sach.getTenSach().indexOf(str) != -1) {
                    xuatThongTin(taiLieu);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuanLyTV QuanLyTV = new QuanLyTV();
        QuanLyTV.nhapDanhSachTaiLieu();
        QuanLyTV.xuatDanhSachTaiLieu();
        System.out.println("Nhập loại bạn muốn tìm: ");
        QuanLyTV.timTheoLoai(input.nextLine());
    }
}
