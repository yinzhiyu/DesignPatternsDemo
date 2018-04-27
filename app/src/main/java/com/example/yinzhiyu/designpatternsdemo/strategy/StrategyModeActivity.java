package com.example.yinzhiyu.designpatternsdemo.strategy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yinzhiyu.designpatternsdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 策略模式
 * 有三个打印机，调用打印机打印
 * 思路：1.三个打印机是同一类型的东东，定一个接口----打印
 *       2.打印机们实现这个接口，实现类，比如：打印机一打印课本，打印机而二打印教程
 *       3.打印机有了，没电也不行啊，于是放在打印室里，
 *       4.我去打印了，我想打印小抄。
 */
public class StrategyModeActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button mButton;
    @BindView(R.id.button2)
    Button mButton2;
    @BindView(R.id.button3)
    Button mButton3;
    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategym_mode);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.button, R.id.button2, R.id.button3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                mContext = new Context(new PrintOneActivity());
                mContext.print();
                break;
            case R.id.button2:
                mContext = new Context(new PrintTwoActivity());
                mContext.print();
                break;
            case R.id.button3:
                mContext = new Context(new PrintThreeActivity());
                mContext.print();
                break;
        }
    }
}
