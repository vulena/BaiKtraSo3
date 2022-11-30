package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgBgr;
    TextView tenTP,mota;
    int tp;
    ImageView img1,img2,img3,img4,img5;
    TextView sumstar;
    CardView cvback,cvSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgBgr=findViewById(R.id.imageBackground);
        tenTP=findViewById(R.id.tenTacPhamDetail);
        img1=findViewById(R.id.star1);
        img2=findViewById(R.id.star2);
        img3=findViewById(R.id.star3);
        img4=findViewById(R.id.star4);
        img5=findViewById(R.id.star5);
        sumstar=findViewById(R.id.tvSumStar);
        cvback = findViewById(R.id.button_back);
        cvSave= findViewById(R.id.button_luu);
        mota=findViewById(R.id.motaDetail);
        tp=getIntent().getIntExtra("tacpham",0);
        imgBgr.setImageResource(TacPhamActivity.tacPhamss.get(tp).getHinhanh());
        tenTP.setText(TacPhamActivity.tacPhamss.get(tp).getTen());
        mota.setText(TacPhamActivity.tacPhamss.get(tp).getMota());
        cvback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailsActivity.this,MainActivity.class));
            }
        });
        cvSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TacPhamActivity.tacPhamss.get(tp).setSao(Float.parseFloat(sumstar.getText().toString()));
                float s = 0;
                for (int i=0;i<TacPhamActivity.tacPhamss.size();i++){
                    s=s+TacPhamActivity.tacPhamss.get(i).getSao();
                }
                MainActivity.tacGias.get(TacPhamActivity.tacPhamss.get(tp).getTacgia()).setSao(s/TacPhamActivity.tacPhamss.size());
                TacPhamActivity.tacPhamAdapter.notifyDataSetChanged();
                MainActivity.tacGiaAdapter.notifyDataSetChanged();
                Toast.makeText(DetailsActivity.this, "Đã lưu", Toast.LENGTH_SHORT).show();
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.icon_star_vang);
                img2.setImageResource(R.drawable.icon_star);
                img3.setImageResource(R.drawable.icon_star);
                img4.setImageResource(R.drawable.icon_star);
                img5.setImageResource(R.drawable.icon_star);
                sumstar.setText("1");
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.icon_star_vang);
                img2.setImageResource(R.drawable.icon_star_vang);
                img3.setImageResource(R.drawable.icon_star);
                img4.setImageResource(R.drawable.icon_star);
                img5.setImageResource(R.drawable.icon_star);
                sumstar.setText("2");
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.icon_star_vang);
                img2.setImageResource(R.drawable.icon_star_vang);
                img3.setImageResource(R.drawable.icon_star_vang);
                img4.setImageResource(R.drawable.icon_star);
                img5.setImageResource(R.drawable.icon_star);
                sumstar.setText("3");
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.icon_star_vang);
                img2.setImageResource(R.drawable.icon_star_vang);
                img3.setImageResource(R.drawable.icon_star_vang);
                img4.setImageResource(R.drawable.icon_star_vang);
                img5.setImageResource(R.drawable.icon_star);
                sumstar.setText("4");
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(R.drawable.icon_star_vang);
                img2.setImageResource(R.drawable.icon_star_vang);
                img3.setImageResource(R.drawable.icon_star_vang);
                img4.setImageResource(R.drawable.icon_star_vang);
                img5.setImageResource(R.drawable.icon_star_vang);
                sumstar.setText("5");
            }
        });

    }
}