package com.wiser.irregularlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.wiser.irregular.IrregularLayout;
import com.wiser.irregular.OnIrregularAdapter;
import com.wiser.irregular.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private IrregularLayout<String> irregularLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        irregularLayout = findViewById(R.id.ill_layout);

        irregularLayout.setOnIrregularAdapter(new OnIrregularAdapter<String>() {
            @Override
            public void onCreateItemView(View itemView, int position, String s) {
                TextView textView = itemView.findViewById(R.id.tv_align_text);
                textView.setText(s);
            }
        });
        irregularLayout.setOnItemClickListener(new OnItemClickListener<String>() {
            @Override
            public void onItemClick(ViewGroup viewGroup, View view, int position, String s) {
                Toast.makeText(MainActivity.this,"s",Toast.LENGTH_LONG).show();
            }
        });

        List<String> list = new ArrayList<>();
        list.add("成语故事");
        list.add("你真是个奇葩人物");
        list.add("典故");
        list.add("我喜欢听故事");
        list.add("你讲给我听");

        irregularLayout.setItems(list);
    }
}
