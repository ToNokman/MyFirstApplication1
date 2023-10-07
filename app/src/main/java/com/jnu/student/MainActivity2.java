package com.jnu.student;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout =  new RelativeLayout(this);
        RelativeLayout.LayoutParams params =  new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        //addRule 参数对应RelativeLayout XML 布局的属性
        params.addRule(RelativeLayout.CENTER_IN_PARENT);     //设置居中
        TextView textView = new TextView(this);     //创建TextView控件
        textView.setText(getString(R.string.tv_one));           //设置TextView的文字内容
        textView.setTextColor(Color.RED);                   //设置TextView的文字颜色
        textView.setTextSize(18);                           //设置TextView的文字大小
        //添加TextView对象和TextView的布局属性
        relativeLayout.addView(textView,params);
        setContentView(relativeLayout);                     //设置在Activity中显示RelativeLayout


    }
}

