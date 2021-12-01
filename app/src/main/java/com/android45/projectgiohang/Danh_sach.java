package com.android45.projectgiohang;

public class Danh_sach {
    private String nameMonAn;
    private long gia;

    public Danh_sach(String nameMonAn, long gia) {
        this.nameMonAn = nameMonAn;
        this.gia = gia;
    }

    public String getNameMonAn() {
        return nameMonAn;
    }

    public void setNameMonAn(String nameMonAn) {
        this.nameMonAn = nameMonAn;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
}
