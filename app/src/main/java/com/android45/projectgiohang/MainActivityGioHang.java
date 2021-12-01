package com.android45.projectgiohang;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivityGioHang extends AppCompatActivity {

    TextView tvTongTien;
    ListView lvGioHang;
    ImageView imgBack;
    AdapterGoHang adapterGoHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gio_hang);
        tvTongTien = findViewById(R.id.tvTongTien);
        lvGioHang = findViewById(R.id.lvCard);
        imgBack = findViewById(R.id.imgback);
        imgBack.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivityGioHang.this, MainActivity.class);
            startActivity(intent);
        });
        EventUlti();
        adapterGoHang = new AdapterGoHang(MainActivityGioHang.this, MainActivity.mangGioHang);
        lvGioHang.setAdapter(adapterGoHang);
    }

    private void EventUlti() {
        long tongtien = 0;
        for (int i = 0; i < MainActivity.mangGioHang.size(); i++) {
            tongtien += MainActivity.mangGioHang.get(i).getGia();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#");
        tvTongTien.setText(decimalFormat.format(tongtien) + "$");
    }
}
