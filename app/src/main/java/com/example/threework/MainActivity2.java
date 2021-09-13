package com.example.threework;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
            Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2=findViewById(R.id.bt);
        TextView t1=findViewById(R.id.t1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=getIntent();
                String name=i2.getStringExtra("a1");
                int age=i2.getIntExtra("a2",20);
                Log.v("TAG","姓名："+name);
                t1.setText("名字："+name+"\n"+"年龄："+age);
                i2.putExtra("re","返回者："+name+"\n"+"年龄："+age);
                setResult(0,i2);
               finish();
            }
        });
    }
}