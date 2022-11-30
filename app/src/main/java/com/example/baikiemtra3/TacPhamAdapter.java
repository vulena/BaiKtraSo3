package com.example.baikiemtra3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {
    private Activity activity;
    private List<TacPham> items;

    public TacPhamAdapter(Activity activity, List<TacPham> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.layout_tacpham_item, null);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name1);
        TextView tvMota = (TextView) view.findViewById(R.id.tv_mota1);
        ImageView imageView = (ImageView) view.findViewById(R.id.item_img1);
        TextView tvSao= view.findViewById(R.id.tv_sao1);
        tvSao.setText("Số sao: "+ String.valueOf(items.get(i).getSao()));
        tvName.setText(items.get(i).getTen());
        tvMota.setText(items.get(i).getMota());
        imageView.setImageResource(items.get(i).getHinhanh());
        return view;
    }
}
