package com.hssy.com.controlimagechange;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{


    private ToggleButton tb;
    private ImageView img;
    private CheckBox checkBox;

    /**
     * 定义一个RadioGroup对象
     */
    private RadioGroup radioGroup;

    //定义一个打开新Activity的按钮
    private Button button;

    //定义一个打开startRelativeLayout的按钮
    private Button startRelativeBtn;

    //定义一个打开startRelativeLayout的按钮
    private Button startRelativeLayout1;
    //定义一个打开startRelativeLayout的按钮
    private Button startFrameLayoutLayout;
    //定义一个打开TableLayoutActivity的按钮
    private Button startTableLayoutBtn;
    //定义一个打开Dialog的Activity的按钮
    private Button startTransParentActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //首先实例化对应的按钮和图片
        tb = (ToggleButton)findViewById(R.id.onOffButton);
        img = (ImageView)findViewById(R.id.imageView);
        checkBox = (CheckBox)findViewById(R.id.checkbox);
        //初始化RadioGroup对象
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        //初始化打开新Activity的按钮
        button = (Button) findViewById(R.id.startActivity);
        //实例化startRelativeBtn按钮
        startRelativeBtn = (Button) findViewById(R.id.startRelativeLayout);
        //实例化startRelativeBtn按钮
        startRelativeLayout1 = (Button) findViewById(R.id.startRelativeLayout1);

        //实例化打开FrameLayout的按钮
        startFrameLayoutLayout = (Button) findViewById(R.id.startFrameLayout);

        //实例化打开TableLayout的按钮
        startTableLayoutBtn = (Button) findViewById(R.id.startTableLayout);

        //实例化打开DialogActivity页面的按钮
        startTransParentActivityBtn = (Button) findViewById(R.id.startTransParentActivity);

        tb.setOnCheckedChangeListener(this);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(),checkBox.getText()+""+isChecked,Toast.LENGTH_SHORT).show();
            }
        });

        //给radioGroup添加监听点击事件
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId){
                    case R.id.boyRadio:
                        Toast.makeText(getApplicationContext(), ((RadioButton) findViewById(R.id.boyRadio)).getText(),Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.girlRadio:
                        Toast.makeText(getApplicationContext(),((RadioButton) findViewById(R.id.girlRadio)).getText(),Toast.LENGTH_SHORT).show();
                    default:
                        break;
                }
            }
        });

        //给打开新Activity的按钮增加监听事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"点击了这个按钮",Toast.LENGTH_SHORT).show();
            }
        });

        //给打开Relative的按钮打开

        startRelativeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });

        //打开另一个Relative的按钮
        startRelativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity1.class);
                startActivity(intent);
            }
        });

        //打开一个FrameLayout的Activity
        startFrameLayoutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FrameLayoutActivity.class);
                startActivity(intent);
            }
        });

        //打开一个TableLayout的按钮增加监听
        startTableLayoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableLayoutActivity.class);
                startActivity(intent);
            }
        });

        //给打开DialogActivity的按钮增加监听
        startTransParentActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TransparentActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        img.setBackgroundResource(isChecked?R.drawable.on:R.drawable.off);

    }
}
