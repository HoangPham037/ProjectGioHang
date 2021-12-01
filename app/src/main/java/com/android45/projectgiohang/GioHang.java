package com.android45.projectgiohang;

public class GioHang {
    public String name;
    public long gia;

    public GioHang(String name, long gia) {
        this.name = name;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
}
