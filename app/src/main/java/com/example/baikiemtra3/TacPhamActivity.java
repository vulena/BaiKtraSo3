package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TacPhamActivity extends AppCompatActivity {
    public static TacPhamAdapter tacPhamAdapter;
    List<TacPham> tacPhams=new ArrayList<>();
    public static List<TacPham> tacPhamss=new ArrayList<>();

    ListView lvTacPham;
    int tacgia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac_pham);
        lvTacPham = findViewById(R.id.lv_TacPham);
        tacPhams.add(new TacPham("Giã từ vũ khí","Giã từ vũ khí (tiếng Anh: A Farewell to Arms) là một tiểu thuyết bán tự truyện của nhà văn Ernest Hemingway viết 1929. Phần lớn cuốn tiểu thuyết này được viết tại nhà bố mẹ vợ Hemingway ở Piggott, Arkansas. Được nhiều nhà phê bình xem là một trong những tiểu thuyết chiến tranh vĩ đại nhất mọi thời đại, câu chuyện được thuật lại thông qua lời kể của trung úy Frederic Henry, một người Mỹ nhưng lái xe cứu thương trong quân đội Ý vào thời Chiến tranh thế giới thứ nhất.",
                R.drawable.img_4,3,0));
        tacPhams.add(new TacPham("Chuông nguyện hồn ai","Chuông nguyện hồn ai (tiếng Anh: For whom the bell tolls) là tiểu thuyết được xuất bản năm 1940 của nhà văn Mỹ Ernest Miller Hemingway. Cuốn tiểu thuyết viết về Robert Jordan, một người Mỹ thuộc Lữ đoàn quốc tế, tham gia chống Phát xít trong cuộc nội chiến Tây Ban Nha. Tựa Chuông nguyện hồn ai được Hemingway lấy từ tác phẩm Meditation XVII của nhà thơ John Donne.",
                R.drawable.img_5,3,0));
        tacPhams.add(new TacPham("Ông già và biển cả","Ông già và Biển cả (tên tiếng Anh: The Old Man and the Sea) là một tiểu thuyết ngắn được Ernest Hemingway viết ở Cuba năm 1951 và xuất bản năm 1952. Nó là truyện ngắn dạng viễn tưởng cuối cùng được Hemingway viết và được xuất bản khi ông còn sống. Đây cũng là tác phẩm nổi tiếng và là một trong những tác phẩm đỉnh cao trong sự nghiệp sáng tác của nhà văn. Tác phẩm đoạt giải Pulitzer cho tác phẩm hư cấu năm 1953. Nó cũng góp phần quan trọng để nhà văn nhận Giải Nobel văn học năm 1954.[1]",
                R.drawable.img_6,3,0));
        tacPhams.add(new TacPham("Hội hè miên man","Hội hè miên man (tựa gốc tiếng Anh: A Moveable Feast) là cuốn hồi ký ra mắt năm 1964 của tác giả người Mỹ Ernest Hemingway, kể về quãng thời gian ông còn là một nhà báo ngoại quốc ở Paris hồi đầu những năm 1920. Cuốn sách khắc họa chi tiết về cuộc hôn nhân đầu tiên của Hemingway với Hadley Richardson, cũng như mối quan hệ của ông với các nhân vật khác thuộc Thế hệ đã mất trong giai đoạn giữa 2 đại chiến ở Pháp.",
                R.drawable.img_7,3,0));
        tacPhams.add(new TacPham("Frederick Russell Burnham","Frederick Russell Burnham (1861-1947) đã mang kỹ thuật Hướng đạo sang Phi Châu và trong Đệ nhị Chiến tranh Matabele ông đã giới thiệu nó cho Robert Baden-Powell, người sáng lập ra phong trào Hướng đạo.[1] Baden-Powell trước tiên bắt đầu hình thành ý tưởng của ông cho một chương trình huấn luyện thanh niên về kỹ thuật Hướng đạo trong khi thực hiện nhiệm vụ trinh sát với Burnham tại Matobo Hills, Matabeleland (hiện tại là một phần của Zimbabwe).",
                R.drawable.img_8,3,0));
        tacPhams.add(new TacPham("Giã từ vũ khí","Giã từ vũ khí (tiếng Anh: A Farewell to Arms) là một tiểu thuyết bán tự truyện của nhà văn Ernest Hemingway viết 1929. Phần lớn cuốn tiểu thuyết này được viết tại nhà bố mẹ vợ Hemingway ở Piggott, Arkansas. Được nhiều nhà phê bình xem là một trong những tiểu thuyết chiến tranh vĩ đại nhất mọi thời đại, câu chuyện được thuật lại thông qua lời kể của trung úy Frederic Henry, một người Mỹ nhưng lái xe cứu thương trong quân đội Ý vào thời Chiến tranh thế giới thứ nhất.",
                R.drawable.hinhtacphan1,0,0));
        tacPhams.add(new TacPham("Chuông nguyện hồn ai","Chuông nguyện hồn ai (tiếng Anh: For whom the bell tolls) là tiểu thuyết được xuất bản năm 1940 của nhà văn Mỹ Ernest Miller Hemingway. Cuốn tiểu thuyết viết về Robert Jordan, một người Mỹ thuộc Lữ đoàn quốc tế, tham gia chống Phát xít trong cuộc nội chiến Tây Ban Nha. Tựa Chuông nguyện hồn ai được Hemingway lấy từ tác phẩm Meditation XVII của nhà thơ John Donne.",
                R.drawable.hinhtacpham2,0,0));
        tacPhams.add(new TacPham("Đoàn thuyền đánh cá","Mô tả đoàn thuyền đánh cá",
                R.drawable.hinhtacpham3,0,0));
        tacPhams.add(new TacPham("Người lái đò sông đà","Mô tả người lái đò sông đà",
                R.drawable.hinhtacpham4,0,0));
        tacPhams.add(new TacPham("Lửa thiêng","Mô tả lửa thiêng",
                R.drawable.hinhtacphamluathieng,0,0));
        tacgia=getIntent().getIntExtra("tacgia",0);
        tacPhamss.clear();
        for (int i=0;i<tacPhams.size();i++){
            if (tacPhams.get(i).getTacgia()==tacgia){
                tacPhamss.add(tacPhams.get(i));
            }
        }
        tacPhamAdapter = new TacPhamAdapter(TacPhamActivity.this,tacPhamss);
        lvTacPham.setAdapter(tacPhamAdapter);
        lvTacPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TacPhamActivity.this,DetailsActivity.class);
                intent.putExtra("tacpham",i);
                startActivity(intent);
            }
        });

    }
}