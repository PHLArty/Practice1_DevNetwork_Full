/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyuser;

/**
 *
 * @author Arty
 */
import java.util.Vector;
public abstract class User {
//Danh sach cac thuoc tinh
protected String hoTen;
protected String phong;
public abstract Vector hienThiRow();
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }
    

    public User(String hoTen, String phong) {
        this.hoTen = hoTen;
        this.phong = phong;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Phòng: " + phong);
    }


}
