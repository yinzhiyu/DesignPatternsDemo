package com.example.yinzhiyu.designpatternsdemo.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.yinzhiyu.designpatternsdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 一小伙娶了烏克蘭美女，但是语言不通，目标小伙讲乌克兰语
 */
public class AdapterActivity extends AppCompatActivity {

    @BindView(R.id.button15)
    Button mButton15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button15)
    public void onViewClicked() {
        Chinese chinese = new Chinese();
        Translator translator = new Translator(chinese);
        translator.sayUkrainian("我爱你！");
    }
}
