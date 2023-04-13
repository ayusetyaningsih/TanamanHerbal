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

public class ObatBunga extends AppCompatActivity {
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_bunga);


        ListView listView = findViewById(R.id.listview);
        searchView = (SearchView) findViewById(R.id.searchTanaman);

        List<String> list = new ArrayList<>();
        list.add("Bunga Tapak Dara");
        list.add("Bunga Telang");
        list.add("Bunga Lawang");
        list.add("Bunga Mawar");
        list.add("Bunga Rosella");
        list.add("Bunga Saffron");
        list.add("Bunga Turi");
        list.add("Bunga Kecombrang");
        list.add("Bunga Melati");
        list.add("Bunga Sepatu");


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
                    startActivity(new Intent(ObatBunga.this,BungaTapakDara.class));

                }
                if(position == 1){
                    startActivity(new Intent(ObatBunga.this,BungaTelang.class));

                }
                if(position == 2){
                    startActivity(new Intent(ObatBunga.this,BungaLawang.class));

                }
                if(position == 3){
                    startActivity(new Intent(ObatBunga.this,BungaMawar.class));

                }
                if(position == 4){
                    startActivity(new Intent(ObatBunga.this,BungaRosella.class));

                }
                if(position == 5){
                    startActivity(new Intent(ObatBunga.this,BungaSaffron.class));

                }
                if(position == 6){
                    startActivity(new Intent(ObatBunga.this,BungaTuri.class));

                }
                if(position == 7){
                    startActivity(new Intent(ObatBunga.this,BungaKecombrang.class));

                }
                if(position == 8){
                    startActivity(new Intent(ObatBunga.this,BungaMelati.class));

                }
                if(position == 9){
                    startActivity(new Intent(ObatBunga.this,BungaSepatu.class));

                }

            }
        });
    }
}