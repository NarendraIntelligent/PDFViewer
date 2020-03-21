package com.nivriti.pdfviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_open_assets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_open_assets=(Button)findViewById(R.id.btn_open_assets);
        btn_open_assets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ViewActivity.class);
                intent.putExtra("ViewType","assets");
                startActivity(intent);

            }
        });
    }
}
