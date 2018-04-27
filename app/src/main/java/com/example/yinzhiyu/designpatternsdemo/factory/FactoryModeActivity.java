package com.example.yinzhiyu.designpatternsdemo.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yinzhiyu.designpatternsdemo.R;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FactoryModeActivity extends AppCompatActivity {

    @BindView(R.id.button10)
    Button mButton10;
    @BindView(R.id.button11)
    Button mButton11;
    @BindView(R.id.button12)
    Button mButton12;
    @BindView(R.id.button13)
    Button mButton13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_mode);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button10, R.id.button11, R.id.button12, R.id.button13})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button10:
                IDataBase people = OTableFactory.createOTable(OTablePeople.class);
                people.add();
                people.del();
                people.change();
                people.query();
                break;
            case R.id.button11:
                IDataBase food = OTableFactory.createOTable(OTableFood.class);
                food.add();
                food.del();
                food.change();
                food.query();
                break;
            case R.id.button12:
                for (int i = 0; i < 10; i++) {
                    System.out.println("随机产生人类" + i);
                    IDataBase iDataBase = OTableFactory.createOTable();
                    iDataBase.add();
                    iDataBase.del();
                    iDataBase.change();
                    iDataBase.query();
                }
                break;
            case R.id.button13:
                IDataBase water = OTableFactory.createOTable(OTableWater.class);
                water.add();
                water.del();
                water.change();
                water.query();
                break;
        }
    }
}
