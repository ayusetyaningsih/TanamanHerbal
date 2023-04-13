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

public class ResepObat extends AppCompatActivity {
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_obat);


        ListView listView = findViewById(R.id.listview);
        searchView = (SearchView) findViewById(R.id.searchTanaman);

        List<String> list = new ArrayList<>();
        list.add("Resep Lengkuas");
        list.add("Resep Jahe");
        list.add("Resep Kunyit");
        list.add("Resep Temulawak");
        list.add("Resep Sambiloto");
        list.add("Resep Cengkeh");
        list.add("Resep Temu Hitam");
        list.add("Resep Temu Giring");
        list.add("Resep Sereh Dapur");
        list.add("Resep Sirih");
        list.add("Resep Kayu Manis");


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
                    startActivity(new Intent(ResepObat.this,ResepLengkuas.class));

                }
                if(position == 1){
                    startActivity(new Intent(ResepObat.this,ResepJahe.class));

                }
                if(position == 2){
                    startActivity(new Intent(ResepObat.this,ResepKunyit.class));

                }
                if(position == 3){
                    startActivity(new Intent(ResepObat.this,ResepTemulawak.class));

                }
                if(position == 4){
                    startActivity(new Intent(ResepObat.this,ResepSambiloto.class));

                }
                if(position == 5){
                    startActivity(new Intent(ResepObat.this,ResepCengkeh.class));

                }
                if(position == 6){
                    startActivity(new Intent(ResepObat.this,ResepTemuHitam.class));

                }
                if(position == 7){
                    startActivity(new Intent(ResepObat.this,ResepTemuGiring.class));

                }
                if(position == 8){
                    startActivity(new Intent(ResepObat.this,ResepSerehDapur.class));

                }
                if(position == 9){
                    startActivity(new Intent(ResepObat.this,ResepSirih.class));

                }
                if(position == 10) {
                    startActivity(new Intent(ResepObat.this, ResepKayuManis.class));

                }
            }
        });
    }
}