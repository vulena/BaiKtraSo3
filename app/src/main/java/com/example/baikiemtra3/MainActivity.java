package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvTacGia;
    public static TacGiaAdapter tacGiaAdapter;
    public static  List<TacGia> tacGias=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTacGia=findViewById(R.id.lv_TacGia);
        tacGias.add(new TacGia("Huy Cận","Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận",R.drawable.img,0));
        tacGias.add(new TacGia("Mạc Ngôn","Mạc Ngôn (sinh ngày 17 tháng 2 năm 1955) là một nhà văn người Trung Quốc xuất thân từ nông dân",R.drawable.img_1,0));
        tacGias.add(new TacGia("Shakespeare","William Shakespeare (tên phiên âm: Uy-li-am Sếch-xpia)",R.drawable.img_2,0));
        tacGias.add(new TacGia("Hemingway","Ernest Miller Hemingway (21 tháng 7 năm 1899 – 2 tháng 7 năm 1961)",R.drawable.img_3,0));

        tacGiaAdapter = new TacGiaAdapter(MainActivity.this,tacGias);
        lvTacGia.setAdapter(tacGiaAdapter);

        lvTacGia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,TacPhamActivity.class);
                intent.putExtra("tacgia",i);
                startActivity(intent);
            }
        });
    }
}