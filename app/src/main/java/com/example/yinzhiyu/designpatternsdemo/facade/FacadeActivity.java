package com.example.yinzhiyu.designpatternsdemo.facade;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.yinzhiyu.designpatternsdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 外观模式/门面模式
 * 思路：1.定义一个写信的过程（接口）
 *       2.写信的具体实现
 *       3.写信，封装，投递，一体化
 *       4.把信的内容和地址给邮局，邮局帮你完成一系列的工作。
 *
 */
public class FacadeActivity extends AppCompatActivity {

    @BindView(R.id.button14)
    Button mButton14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button14)
    public void onViewClicked() {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("我是信的内容","我是信的地址");
    }
}
