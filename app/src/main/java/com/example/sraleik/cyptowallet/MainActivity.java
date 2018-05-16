package com.example.sraleik.cyptowallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listeCoin = findViewById(R.id.listCoin);
        final CoinItem data[] = {new CoinItem("Bitcoin", "bitcoin", "€7536.32", "0.25541", 12.41),
                new CoinItem("Ethereum", "ethereum", "€600.32", "1.55541", -2.45),
                new CoinItem("Litecoin", "litecoin", "€100.32", "100.55541", 3.45)};

        ListAdapter myAdapter = new CoinListAdapter(this, data);
        listeCoin.setAdapter(myAdapter);

        listeCoin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parentView, View childView, int position, long id)
            {
                Intent intent = new Intent(getApplicationContext(), DetailCoin.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("coinInfo", data[position]);
                intent.putExtras(bundle);
                startActivity(intent);
            }

        });
    }
}
