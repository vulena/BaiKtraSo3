package com.example.baikiemtra3;

public class TacGia {
    String ten,mota;
    int hinhAnh;
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

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public float getSao() {
        return sao;
    }

    public void setSao(float sao) {
        this.sao = sao;
    }

    public TacGia(String ten, String mota, int hinhAnh, float sao) {
        this.ten = ten;
        this.mota = mota;
        this.hinhAnh = hinhAnh;
        this.sao = sao;
    }
}
