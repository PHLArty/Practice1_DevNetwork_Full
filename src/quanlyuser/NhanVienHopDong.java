/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyuser;

import java.util.Vector;

/**
 *
 * @author Arty
 */
public class NhanVienHopDong extends User{
    private String luongHopDong;
    private String loaiHopDong; // NH: ngắn hạn, DH: dài hạn

    public String getLuongHopDong() {
        return luongHopDong;
    }

    public void setLuongHopDong(String luongHopDong) {
        this.luongHopDong = luongHopDong;
    }

    public String getLoaiHopDong() {
        return loaiHopDong;
    }

    public void setLoaiHopDong(String loaiHopDong) {
        this.loaiHopDong = loaiHopDong;
    }

    public NhanVienHopDong(String hoTen, String phong, String luongHopDong, String loaiHopDong) {
        super(hoTen, phong);
        this.luongHopDong = luongHopDong;
        this.loaiHopDong = loaiHopDong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Lương hợp đồng: " + luongHopDong);
        System.out.println("Loại hợp đồng: " + loaiHopDong);
    }
    @Override
public Vector hienThiRow() {
    Vector row = new Vector();
    row.add(hoTen); // Thêm họ tên
    row.add(this.phong); // Thêm phòng ban
    row.add(this.loaiHopDong); // Thêm loại hợp đồng (NH hoặc DH)
    row.add(this.luongHopDong); // Thêm lương hợp đồng
    
    // Có thể thêm cột Total Salary nếu có tính toán khác
    row.add(this.tinhTongLuong()); // Gọi phương thức tính tổng lương (nếu có)

    return row;
}

// Ví dụ phương thức tính tổng lương
public double tinhTongLuong() {
    double luongHopDongDouble = Double.parseDouble(this.luongHopDong);
    return luongHopDongDouble; 
}
}
