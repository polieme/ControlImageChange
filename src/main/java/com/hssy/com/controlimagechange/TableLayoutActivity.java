package com.hssy.com.controlimagechange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TableLayoutActivity extends AppCompatActivity {


    private final String TAG = "tag";
    private Button calcButtonBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"TableLayoutActivity->onCreate");
        setContentView(R.layout.activity_table_layout);

        //实例化打开计算器按钮
        calcButtonBtn = (Button) findViewById(R.id.calcButton);
        calcButtonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableLayoutActivity.this,CalcActivity.class);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onStart() {
        Log.i(TAG,"TableLayoutActivity->onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG,"TableLayoutActivity->onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"TableLayoutActivity->onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"TableLayoutActivity->onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"TableLayoutActivity->onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG,"TableLayoutActivity->onRestart");
        super.onRestart();
    }

}
