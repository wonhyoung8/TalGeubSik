package com.example.owner.talgeubsik11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_Main_Category(View view){
        //TODO
    }

    public void onClick_Main_Random(View view){
        Toast.makeText(this,"랜덤메뉴 준비중!",Toast.LENGTH_SHORT).show();
        //TODO
    }

    public void onClick_Main_Geubsik(View view){
        Toast.makeText(this,"급식정보 준비중!",Toast.LENGTH_SHORT).show();
        //TODO
    }

    public void onClick_Main_Gansik(View view){
        Toast.makeText(this,"간식정보 준비중!",Toast.LENGTH_SHORT).show();
        //TODO
    }

}
