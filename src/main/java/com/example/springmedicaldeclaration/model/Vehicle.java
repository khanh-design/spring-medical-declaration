package com.example.springmedicaldeclaration.model;

import java.util.Date;

public class Vehicle {
    private String thongTinDiLai;
    private String soHieuPhuongTien;
    private int soGhe;
    private String ngayKhoiHanh;
    private String ngayKetThuc;
    private String mota;

    public Vehicle() {

    }
    public Vehicle(String thongTinDiLai, String soHieuPhuongTien, int soGhe, String ngayKhoiHanh, String ngayKetThuc, String mota) {
        this.thongTinDiLai = thongTinDiLai;
        this.soHieuPhuongTien = soHieuPhuongTien;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.mota = mota;
    }

    public String getThongTinDiLai() {
        return thongTinDiLai;
    }

    public void setThongTinDiLai(String thongTinDiLai) {
        this.thongTinDiLai = thongTinDiLai;
    }

    public String getSoHieuPhuongTien() {
        return soHieuPhuongTien;
    }

    public void setSoHieuPhuongTien(String soHieuPhuongTien) {
        this.soHieuPhuongTien = soHieuPhuongTien;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
