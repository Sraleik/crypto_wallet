package com.example.sraleik.cyptowallet;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CoinListAdapter extends BaseAdapter {
    private final MainActivity context;
    private CoinItem data[];

    public CoinListAdapter(MainActivity mainActivity, CoinItem data[]) {
        context  = mainActivity;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public Drawable getDrawable(String name) {
        int resourceId = this.context.getResources().getIdentifier(name, "drawable", this.context.getPackageName());
        return this.context.getResources().getDrawable(resourceId);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v;
        if (convertView == null) {
            v = inflater.inflate(R.layout.item_coin_list, null);
        } else {
            v = convertView;
        }

        ImageView img = v.findViewById(R.id.imageCoin);
        TextView name = v.findViewById(R.id.textCoinName);
        TextView quantity = v.findViewById(R.id.textCoinQuantity);
        TextView currentValue = v.findViewById(R.id.textCoinUserValue);
        TextView todayChange = v.findViewById(R.id.text24hChange);


        img.setImageDrawable(getDrawable(data[i].getImgUrl()));
        name.setText(data[i].getName());
        quantity.setText(data[i].getUserQuantity());
        currentValue.setText(data[i].getCurrentValue());
        if(data[i].getTodayChange() < 0){
            todayChange.setText("" + data[i].getTodayChange()+"▼");
            todayChange.setTextColor(ContextCompat.getColor(context, R.color.colorTextRed));
        }else{
            todayChange.setText("" + data[i].getTodayChange()+"▲");
            todayChange.setTextColor(ContextCompat.getColor(context, R.color.colorTextGreen));
        }

        return v;
    }
}

