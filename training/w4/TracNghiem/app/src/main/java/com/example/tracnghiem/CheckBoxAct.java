package com.example.tracnghiem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheckBoxAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
    }
    public void onBack(View view){
        Intent intent1 = new Intent(this, ToggAct.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent1);
    }
    public void onNext(View view){
        Intent intent2 = new Intent(this, RadioAct.class);
        intent2.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent2);
    }
}
