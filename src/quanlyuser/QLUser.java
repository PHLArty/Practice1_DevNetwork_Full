/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyuser;

/**
 *
 * @author Arty
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
public class QLUser {
//Tao mang chua danh sach cac bien tham chieu luu dia chi user
private static ArrayList<User> user = new ArrayList<>();

//ham khoi tao
public QLUser(){
}


//ham them user vao danh sach quan ly
public void themUser(User u){   
user.add(u);

}

//ham tao user va luu dia chi user vao danh sach de quan ly
public void themUser(String t,String phong,String luong,String loai){
    User nv;
    if(loai == "NH" || loai == "DH")
    {
        nv = new NhanVienHopDong(t, phong, luong, loai);
    }else {
        nv = new NhanVienBienChe(t, phong, luong, loai);
    }
    user.add(nv);  
}
public Vector displayUser(){
    Vector rows=new Vector();
for (int i = 0; i < user.size(); i++) {
    rows.add(user.get(i).hienThiRow());
}
    return rows;
}
public Vector TheoLoai(String loai) {
    // Tạo vector để lưu kết quả trả lại
    Vector rows = new Vector();
    
    for (int i = 0; i < user.size(); i++) {
        // Kiểm tra nếu đối tượng là loại Nhân viên hợp đồng
        if (user.get(i) instanceof NhanVienHopDong) {
            NhanVienHopDong nvhd = (NhanVienHopDong) user.get(i); // Ép kiểu để truy cập các thuộc tính của NhanVienHopDong
    if (nvhd.getLoaiHopDong().equals(loai)) { // So sánh chuỗi "loai" với giá trị của đối tượng
        rows.add(nvhd.hienThiRow()); // Thêm vào kết quả nếu điều kiện thỏa mãn
    }
        }
        
    }
    
    return rows;
}

public Vector DisplayWithTongLuong(){
    Vector rows=new Vector();
for (int i = 0; i < user.size(); i++) {
    rows.add(user.get(i).hienThiRow());
}
    return rows;
}
}
