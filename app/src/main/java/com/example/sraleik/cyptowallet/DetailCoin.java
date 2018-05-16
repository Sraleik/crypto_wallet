package com.example.sraleik.cyptowallet;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailCoin extends AppCompatActivity {

    public Drawable getDrawable(String name) {
        int resourceId = this.getResources().getIdentifier(name, "drawable", this.getPackageName());
        return this.getResources().getDrawable(resourceId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_coin);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        CoinItem coinInfo = (CoinItem)bundle.getSerializable("coinInfo");
        Log.d("COIN_INFO",coinInfo.getName());

        ImageView img = findViewById(R.id.imageCoinDetail);
        ImageView img2 = findViewById(R.id.imageCoinPreview);

        TextView coinName = findViewById(R.id.coinNameDetail);
        TextView coinCurrentValue = findViewById(R.id.coinCurrentValue);
        TextView coinQuantity = findViewById(R.id.coinQuantity);


        img.setImageDrawable(getDrawable(coinInfo.getImgUrl()));
        img2.setImageDrawable(getDrawable(coinInfo.getImgUrl()));

        coinName.setText(coinInfo.getName());
        coinCurrentValue.setText(coinInfo.getCurrentValue());
        coinQuantity.setText(coinInfo.getUserQuantity());

    }
}
