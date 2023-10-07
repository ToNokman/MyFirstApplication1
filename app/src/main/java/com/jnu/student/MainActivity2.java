package com.jnu.student;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            // 获取两个TextView的文本
            String text1 = textView1.getText().toString();
            String text2 = textView2.getText().toString();

            // 交换两个TextView的文本
            textView1.setText(text2);
            textView2.setText(text1);

            // 显示交换成功的提示信息
            Toast.makeText(MainActivity2.this, "交换成功", Toast.LENGTH_SHORT).show();

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
            builder.setMessage("交换成功")
                    .setPositiveButton("确定", null)
                    .show();
        });
    }
}


