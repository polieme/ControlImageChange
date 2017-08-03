package com.hssy.com.controlimagechange;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrameLayoutActivity extends AppCompatActivity {

    //初始化ProgessBar
    private TextView textView;

    //按钮
    private Button progressBtn;

    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            textView.setText(msg.what+"%");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        textView = (TextView) findViewById(R.id.progressTextView);
        progressBtn = (Button) findViewById(R.id.progressBtn);

        progressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //打开一个新的Activity
                /*Intent intent = new Intent(FrameLayoutActivity.this,FrameLayoutActivity1.class);
                startActivity(intent);*/
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        for(int i=0 ;i<=100 ;i++){
                            Message msg = new Message();
                            msg.what = i;
                            handler.sendMessage(msg);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}
