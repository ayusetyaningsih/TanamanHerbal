package com.example.tanamanherbal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class TanamanHerbal extends AppCompatActivity {
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanaman_herbal);


        ListView listView = findViewById(R.id.listview);
        searchView = (SearchView) findViewById(R.id.searchTanaman);

        List<String> list = new ArrayList<>();
        list.add("Lengkuas");
        list.add("Jahe");
        list.add("Kunyit");
        list.add("Temulawak");
        list.add("Sambiloto");
        list.add("Cengkeh");
        list.add("Temu Hitam");
        list.add("Temu Giring");
        list.add("Sereh Dapur");
        list.add("Sirih");
        list.add("Kayu Manis");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    startActivity(new Intent(TanamanHerbal.this,Lengkuas.class));

                }
                if(position == 1){
                    startActivity(new Intent(TanamanHerbal.this,Jahe.class));

                }
                if(position == 2){
                    startActivity(new Intent(TanamanHerbal.this,Kunyit.class));

                }
                if(position == 3){
                    startActivity(new Intent(TanamanHerbal.this,Temulawak.class));

                }
                if(position == 4){
                    startActivity(new Intent(TanamanHerbal.this,Sambiloto.class));

                }
                if(position == 5){
                    startActivity(new Intent(TanamanHerbal.this,Cengkeh.class));

                }
                if(position == 6){
                    startActivity(new Intent(TanamanHerbal.this,TemuHitam.class));

                }
                if(position == 7){
                    startActivity(new Intent(TanamanHerbal.this,TemuGiring.class));

                }
                if(position == 8){
                    startActivity(new Intent(TanamanHerbal.this,SerehDapur.class));

                }
                if(position == 9){
                    startActivity(new Intent(TanamanHerbal.this,Sirih.class));

                }
                if(position == 10){
                    startActivity(new Intent(TanamanHerbal.this,KayuManis.class));

                }

            }
        });
    }
}