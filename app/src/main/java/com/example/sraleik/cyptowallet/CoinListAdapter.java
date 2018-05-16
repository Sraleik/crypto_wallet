package com.example.sraleik.cyptowallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v;
        if (convertView == null) {
            v = inflater.inflate(R.layout.item_coin_list, null);
        } else {
            v = convertView;
        }

        //TextView img = v.findViewById(R.id.imageCoin);
        TextView name = v.findViewById(R.id.textCoinName);
       /* TextView quantity = v.findViewById(R.id.textCoinQuantity);
        TextView currentValue = v.findViewById(R.id.textCoinUserValue);
        TextView todayChange = v.findViewById(R.id.text24hChange);*/



        name.setText(data[i].getName());
        /*quantity.setText(data[i].getUserQuantity());
        currentValue.setText(data[i].getCurrentValue());
        todayChange.setText(data[i].getTodayChange());*/

        return v;
    }
}
