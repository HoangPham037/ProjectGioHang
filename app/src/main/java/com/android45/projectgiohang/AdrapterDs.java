package com.android45.projectgiohang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdrapterDs extends BaseAdapter {
    private List<Danh_sach> list;
    private Context context;
    private int layout;

    public AdrapterDs(List<Danh_sach> list, Context context, int layout) {
        this.list = list;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        Danh_sach ds = list.get(position);

        TextView tvName = convertView.findViewById(R.id.tvItem);

        tvName.setText(ds.getNameMonAn());
        return convertView;
    }
}
