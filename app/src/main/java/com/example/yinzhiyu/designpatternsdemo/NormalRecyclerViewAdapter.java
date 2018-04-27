package com.example.yinzhiyu.designpatternsdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yinzhiyu.designpatternsdemo.adapter.AdapterActivity;
import com.example.yinzhiyu.designpatternsdemo.facade.FacadeActivity;
import com.example.yinzhiyu.designpatternsdemo.factory.FactoryModeActivity;
import com.example.yinzhiyu.designpatternsdemo.proxy.ProxyModeActivity;
import com.example.yinzhiyu.designpatternsdemo.singlet.SingletActivity;
import com.example.yinzhiyu.designpatternsdemo.strategy.StrategyModeActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yinzhiyu on 2017/12/28.
 */

public class NormalRecyclerViewAdapter extends RecyclerView.Adapter<NormalRecyclerViewAdapter.NormalTextViewHolder> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private List<String> list;

    public NormalRecyclerViewAdapter(Context context, List<String> list) {
        this.list = list;
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public NormalTextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NormalTextViewHolder(mLayoutInflater.inflate(R.layout.item_text, parent, false));
    }

    @Override
    public void onBindViewHolder(NormalTextViewHolder holder, int position) {
        final String mode = list.get(position);
        holder.mTextView.setText(mode);
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                switch (mode) {
                    case "策略模式":
                        intent.setClass(mContext, StrategyModeActivity.class);
                        mContext.startActivity(intent);
                        break;
                    case "代理模式":
                        intent.setClass(mContext, ProxyModeActivity.class);
                        mContext.startActivity(intent);
                        break;
                    case "单利模式":
                        intent.setClass(mContext, SingletActivity.class);
                        mContext.startActivity(intent);
                        break;
                    case "工厂模式":
                        intent.setClass(mContext, FactoryModeActivity.class);
                        mContext.startActivity(intent);
                        break;
                    case "外观模式":
                        intent.setClass(mContext, FacadeActivity.class);
                        mContext.startActivity(intent);
                        break;
                    case "适配器模式":
                        intent.setClass(mContext, AdapterActivity.class);
                        mContext.startActivity(intent);
                        break;


                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class NormalTextViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.text_view)
        TextView mTextView;

        NormalTextViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("NormalTextViewHolder", "onClick--> position = " + getPosition());
                }
            });
        }
    }

}