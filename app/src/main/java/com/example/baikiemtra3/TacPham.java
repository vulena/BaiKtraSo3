package com.example.baikiemtra3;

public class TacPham {
    String ten,mota;
    int hinhanh,tacgia;
    float sao;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public int getTacgia() {
        return tacgia;
    }

    public void setTacgia(int tacgia) {
        this.tacgia = tacgia;
    }

    public float getSao() {
        return sao;
    }

    public void setSao(float sao) {
        this.sao = sao;
    }

    public TacPham(String ten, String mota, int hinhanh, int tacgia, float sao) {
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.tacgia = tacgia;
        this.sao = sao;
    }
}
