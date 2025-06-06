package com.example.springmedicaldeclaration.model;

public class Address {
    private String tinh;
    private String quan;
    private String phuong;
    private String thuongChu;
    private String soDienThoai;
    private String email;

    public Address() {

    }
    public Address(String tinh, String quan, String phuong, String thuongChu, String soDienThoai, String email) {
        this.tinh = tinh;
        this.quan = quan;
        this.phuong = phuong;
        this.thuongChu = thuongChu;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getThuongChu() {
        return thuongChu;
    }

    public void setThuongChu(String thuongChu) {
        this.thuongChu = thuongChu;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
