package com.wdj.menu_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        tv1 = (TextView) findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                tv1.setTextColor(Color.BLACK);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                baseLayout.setRotation(45);
                return true;
            case R.id.subSize:
                baseLayout.setScaleX(1.5f);
                baseLayout.setScaleY(1.5f);
                return true;
            case R.id.backRotate:
                baseLayout.setRotation(0);
                return true;
            case R.id.normalScale:
                baseLayout.setScaleX(1.0f);
                baseLayout.setScaleY(1.0f);
                return true;
        }
        return false;
    }
}