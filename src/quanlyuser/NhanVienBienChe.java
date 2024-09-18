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
public class NhanVienBienChe extends User{
    private String heSoLuong;
    private String soNamCongTac;

    public NhanVienBienChe(String hoTen, String phong, String heSoLuong, String soNamCongTac) {
        super(hoTen, phong);
        this.heSoLuong = heSoLuong;
        this.soNamCongTac = soNamCongTac;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Số năm công tác: " + soNamCongTac);
    }
    @Override
public Vector hienThiRow() {
    Vector row = new Vector();
    row.add(hoTen); // Thêm họ tên
    row.add(this.phong); // Thêm phòng ban
    row.add(this.heSoLuong); // Thêm hệ số lương
    row.add(this.soNamCongTac); // Thêm số năm công tác
    
    // Thêm cột Total Salary nếu có
    row.add(this.tinhTongLuong()); // Gọi phương thức tính tổng lương

    return row;
}

// Ví dụ phương thức tính tổng lương cho nhân viên biên chế
public double tinhTongLuong() {
    try {
        double heSoLuongDouble = Double.parseDouble(this.heSoLuong); // Chuyển đổi heSoLuong
        int soNamCongTacInt = Integer.parseInt(this.soNamCongTac); // Chuyển đổi soNamCongTac
        return heSoLuongDouble * soNamCongTacInt;
    } catch (NumberFormatException e) {
        System.out.println("Dữ liệu không hợp lệ: " + e.getMessage());
        return 0; // Trả về 0 hoặc một giá trị mặc định nếu dữ liệu không hợp lệ
    }
}


}
