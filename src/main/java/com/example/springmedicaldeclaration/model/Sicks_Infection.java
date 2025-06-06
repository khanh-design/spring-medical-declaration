package com.example.springmedicaldeclaration.model;

public class Sicks_Infection {
    private boolean sot;
    private boolean ho;
    private boolean khoTho;
    private boolean dauHong;
    private boolean non;
    private boolean tieuChay;
    private boolean xuatHuyet;
    private boolean noiBan;
    private boolean tiepXucGan;
    private boolean tiepVoibenhNhan;

    public Sicks_Infection() {

    }

    public Sicks_Infection(boolean sot, boolean ho, boolean khoTho, boolean dauHong, boolean non, boolean tieuChay, boolean xuatHuyet, boolean noiBan, boolean tiepXucGan, boolean tiepVoibenhNhan) {
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.non = non;
        this.tieuChay = tieuChay;
        this.xuatHuyet = xuatHuyet;
        this.noiBan = noiBan;
        this.tiepXucGan = tiepXucGan;
        this.tiepVoibenhNhan = tiepVoibenhNhan;
    }

    public boolean isSot() {
        return sot;
    }

    public void setSot(boolean sot) {
        this.sot = sot;
    }

    public boolean isHo() {
        return ho;
    }

    public void setHo(boolean ho) {
        this.ho = ho;
    }

    public boolean isKhoTho() {
        return khoTho;
    }

    public void setKhoTho(boolean khoTho) {
        this.khoTho = khoTho;
    }

    public boolean isDauHong() {
        return dauHong;
    }

    public void setDauHong(boolean dauHong) {
        this.dauHong = dauHong;
    }

    public boolean isNon() {
        return non;
    }

    public void setNon(boolean non) {
        this.non = non;
    }

    public boolean isTieuChay() {
        return tieuChay;
    }

    public void setTieuChay(boolean tieuChay) {
        this.tieuChay = tieuChay;
    }

    public boolean isXuatHuyet() {
        return xuatHuyet;
    }

    public void setXuatHuyet(boolean xuatHuyet) {
        this.xuatHuyet = xuatHuyet;
    }

    public boolean isNoiBan() {
        return noiBan;
    }

    public void setNoiBan(boolean noiBan) {
        this.noiBan = noiBan;
    }

    public boolean isTiepXucGan() {
        return tiepXucGan;
    }

    public void setTiepXucGan(boolean tiepXucGan) {
        this.tiepXucGan = tiepXucGan;
    }

    public boolean isTiepVoibenhNhan() {
        return tiepVoibenhNhan;
    }

    public void setTiepVoibenhNhan(boolean tiepVoibenhNhan) {
        this.tiepVoibenhNhan = tiepVoibenhNhan;
    }
}
