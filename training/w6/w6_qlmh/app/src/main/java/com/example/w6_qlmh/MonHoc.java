package com.example.w6_qlmh;

public class MonHoc {
    public int img;
    public String ten,ma, sotiet;

    public MonHoc(int img, String ten, String ma, String sotiet) {
        this.img = img;
        this.ten = ten;
        this.ma = ma;
        this.sotiet = sotiet;
    }

    public MonHoc() {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getSotiet() {
        return sotiet;
    }

    public void setSotiet(String sotiet) {
        this.sotiet = sotiet;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "img=" + img +
                ", ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", sotiet='" + sotiet + '\'' +
                '}';
    }
}
