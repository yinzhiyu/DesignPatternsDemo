package com.example.yinzhiyu.designpatternsdemo.singlet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yinzhiyu.designpatternsdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SingletActivity extends AppCompatActivity {

    @BindView(R.id.button8)
    Button mButton8;
    @BindView(R.id.textView3)
    TextView mTextView3;
    @BindView(R.id.button9)
    Button mButton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlet);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button8, R.id.button9})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button8:
                Emperor emperor = Emperor.getInstance();
                emperor.emperorName();
                mTextView3.setText("尹狗蛋儿！");
                break;
            case R.id.button9:
                int ministerNum = 10;
                for (int i = 0; i < ministerNum; i++) {
                    Multition multition = Multition.getInstance();
                    System.out.println("第" + (i + 1) + "个大臣参拜的是：");
                    multition.multitionInfo();
                }
                break;
        }
    }

}
