package com.example.androidstudy;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.android2);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0FA45A")));

    }

    //액션바에 메뉴 추가
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sample, menu);
        return true;
    }

    //메뉴 클릭 시 동작
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.actionbar_menu) {
            Toast.makeText(this, "액션 버튼 클릭", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.actionbar_menu1) {
            Toast.makeText(this, "설정 클릭", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (id == R.id.actionbar_menu2) {
            Toast.makeText(this, "옵션 클릭", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
