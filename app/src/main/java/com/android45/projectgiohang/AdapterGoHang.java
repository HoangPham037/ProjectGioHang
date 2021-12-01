package com.android45.projectgiohang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterGoHang extends BaseAdapter {
    private Context context;
    private ArrayList<GioHang> ListGioHang;

    public AdapterGoHang(Context context, ArrayList<GioHang> listGioHang) {
        this.context = context;
        ListGioHang = listGioHang;
    }

    @Override
    public int getCount() {
        return ListGioHang.size();
    }

    @Override
    public Object getItem(int position) {
        return ListGioHang.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public  class ViewHoher{
        public TextView tvItemGioHang;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoher viewHoher = null;
        if(viewHoher == null){
            viewHoher = new ViewHoher();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.ic_dong_giohang,null);
            viewHoher.tvItemGioHang = convertView.findViewById(R.id.tvItemGioHangName);
            convertView.setTag(viewHoher);
        }else{
            viewHoher = (ViewHoher) convertView.getTag();
        }
        GioHang gioHang = (GioHang) getItem(position);
        viewHoher.tvItemGioHang.setText(gioHang.getName());
        return convertView;
    }
}
