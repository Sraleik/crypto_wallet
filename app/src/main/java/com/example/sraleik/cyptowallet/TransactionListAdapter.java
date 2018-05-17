package com.example.sraleik.cyptowallet;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TransactionListAdapter extends BaseAdapter {
    private final DetailCoin context;
    private Transaction data[];

    public TransactionListAdapter(DetailCoin mainActivity, Transaction data[]) {
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
            v = inflater.inflate(R.layout.item_transaction_list, null);
        } else {
            v = convertView;
        }

        ImageView img = v.findViewById(R.id.imageTransaction);
        TextView type = v.findViewById(R.id.textTypeTransaction);
        TextView date = v.findViewById(R.id.textTransactionDate);
        TextView quantity = v.findViewById(R.id.textCoinQuantity2);
        TextView fiatValue = v.findViewById(R.id.textTransactionFiatValue);

        if(data[i].getType().equals("sell")) {
            img.setImageDrawable(getDrawable("oval10"));
            quantity.setTextColor(ContextCompat.getColor(context, R.color.colorTextRed));
        }else{
            img.setImageDrawable(getDrawable("oval10copy"));
            quantity.setTextColor(ContextCompat.getColor(context, R.color.colorTextGreen));
        }

        type.setText(data[i].getType());
        date.setText(data[i].getDate().toString());
        quantity.setText(data[i].getQuantity() + data[i].getCoinCurrency());
        fiatValue.setText("€" + data[i].getFiatValue());

        /*name.setText(data[i].getName());
        quantity.setText(data[i].getUserQuantity());
        currentValue.setText(data[i].getCurrentValue());

        if(data[i].getTodayChange() < 0){
            todayChange.setText("" + data[i].getTodayChange()+"▼");
            todayChange.setTextColor(ContextCompat.getColor(context, R.color.colorTextRed));
        }else{
            todayChange.setText("" + data[i].getTodayChange()+"▲");
            todayChange.setTextColor(ContextCompat.getColor(context, R.color.colorTextGreen));
        }*/

        return v;
    }
}

