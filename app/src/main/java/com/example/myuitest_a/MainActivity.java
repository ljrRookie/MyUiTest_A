package com.example.myuitest_a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.iv_image);
        findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorFilter.imageViewColorFilter(mImageView,ColorFilter.colormatrix_huajiu);
            }
        });
    }
}
