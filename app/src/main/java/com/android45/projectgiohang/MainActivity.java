package com.android45.projectgiohang;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Danh_sach> listData;

    Danh_sach item1, item2, item3, item4, item5;
    Button btnOrder;
    TextView tvThank, tvPrice;
    ListView lvListOrder;
    ImageView imgGioHang;
    public static ArrayList<GioHang> mangGioHang;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOrder = findViewById(R.id.btnOrder);
        tvThank = findViewById(R.id.tvThankyou);
        lvListOrder = findViewById(R.id.lvListOrder);
        imgGioHang = findViewById(R.id.imgGioHang);
        tvPrice = findViewById(R.id.tvPrice);
        AdrapterDs adrapterDs;
        listData = new ArrayList<>();
        item1 = new Danh_sach("Ếch nướng", 10);
        item2 = new Danh_sach("Cơm rang thập cẩm", 12);
        item3 = new Danh_sach("Sườn xào chua ngot", 15);
        item4 = new Danh_sach("Cá chỉ vàng", 5);
        item5 = new Danh_sach("Đậu phụ lướt", 7);

        listData.add(item1);
        listData.add(item2);
        listData.add(item3);
        listData.add(item4);
        listData.add(item5);

        adrapterDs = new AdrapterDs(listData, MainActivity.this, R.layout.ic_danhsach);
        lvListOrder.setAdapter(adrapterDs);
        mangGioHang = new ArrayList<>();
        imgGioHang.setOnClickListener(v -> {
                mangGioHang.size();
                Intent intent = new Intent(MainActivity.this, MainActivityGioHang.class);
                startActivity(intent);

        });

        lvListOrder.setOnItemClickListener((parent, view, position, id) -> {
            String giaa = String.valueOf(listData.get(position).getGia());
                name = listData.get(position).getNameMonAn();
                long gia = listData.get(position).getGia();
                tvPrice.setText(giaa+"$");
                mangGioHang.add(new GioHang(name,gia));
        });
        btnOrder.setOnClickListener(v -> {
            tvPrice.setText("0$");
            tvThank.setText("Thank you!Your order is sent to restaurant");
        });
    }
}