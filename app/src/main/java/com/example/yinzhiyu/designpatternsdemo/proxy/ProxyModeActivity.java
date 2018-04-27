package com.example.yinzhiyu.designpatternsdemo.proxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yinzhiyu.designpatternsdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 代理模式
 * Rain很忙，忙得没空理你，那你要找Rain就需要找Rain的经纪人 / 代理人。
 * 代理人知道被代理人能做哪些事情不能做哪些事情，那就是两个人具备同一个接口，
 * 代理人虽然不会唱歌，但是被代理人会唱啊。
 * 思路：1.定义工作室，经纪人和艺人都属于这一类型的人。
 *       2.这一类型，实现这个接口，定义Rain
 *       3.定义代理人/经纪人
 *       4.经纪人出去接商演，之后艺人去演出
 *
 *       5.经纪人又带了另一个艺人，定义艺人，接商演
 */
public class ProxyModeActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView mTextView;
    @BindView(R.id.button4)
    Button mButton4;
    @BindView(R.id.button5)
    Button mButton5;
    @BindView(R.id.textView2)
    TextView mTextView2;
    @BindView(R.id.button6)
    Button mButton6;
    @BindView(R.id.button7)
    Button mButton7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_mode);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.button4, R.id.button5, R.id.button6, R.id.button7})
    public void onViewClicked(View view) {
        Proxy proxy = new Proxy();
        ArtistRandy mArtistRandy = new ArtistRandy();
        Proxy mProxy = new Proxy(mArtistRandy);
        switch (view.getId()) {
            case R.id.button4://唱歌
                proxy.singing();
                break;
            case R.id.button5://
                proxy.dangcing();
                break;
            case R.id.button6:
                mProxy.singing();
                break;
            case R.id.button7:
                mProxy.dangcing();
                break;
        }
    }

}
