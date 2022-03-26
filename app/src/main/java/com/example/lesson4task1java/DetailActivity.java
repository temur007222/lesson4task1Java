package com.example.lesson4task1java;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = DetailActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        initView();
    }
void initView(){
    TextView tv_detail = findViewById(R.id.tv_detail);
    String name = getIntent().getStringExtra("name and age ");
    Log.d(TAG, name);

    tv_detail.setText(name);
    }
}
