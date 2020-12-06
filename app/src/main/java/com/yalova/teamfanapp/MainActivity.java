package com.yalova.teamfanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.yalova.teamfanapp.adapter.TeamAdapter;
import com.yalova.teamfanapp.objects.Team;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeams;
    private ArrayList<Team> teams;
    private TeamAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTeams=findViewById(R.id.rvTeamList);
        teams=new ArrayList<>();
        teams.add(new Team("Fenerbahçe", R.drawable.fb, R.color.yellow, R.color.darkblue, 0,"Ali Koç", "Şükrü Saraçoğlu"));
        teams.add(new Team("Galatasaray", R.drawable.gs, R.color.yellow, R.color.red,0,"Mustafa Cengiz", "Türk Telokom Arena"));
        teams.add(new Team("Beşiktaş",R.drawable.bjk,R.color.black, R.color.white,0,"Ahmet Nur Çelebi","Vodafone park"));
        teams.add(new Team("Başakşehir", R.drawable.bsk, R.color.darkblue, R.color.orange,0,"Göksel Gümüşdağ","Fatih Terim Stadı"));
        teams.add(new Team("Trabzonspor", R.drawable.ts, R.color.bordo, R.color.blue, 0,"Ahmet Ağaoğlu", "Şenol Güneş Stadi"));
        teams.add(new Team("Sivasspor", R.drawable.svs, R.color.red, R.color.white, 0,"mecnun okyakmaz", " Sivas Stadı"));
        teams.add(new Team("Kayserispor", R.drawable.kys, R.color.red, R.color.yellow, 0,"berna gözbaşı", "Kayseri Stadı"));
        teams.add(new Team("Antalyaspor", R.drawable.ant, R.color.red, R.color.white, 0,"Ali safak öztürk", "Antalya Stadı"));
        adapter=new TeamAdapter(this,teams);
        rvTeams.setAdapter(adapter);
        rvTeams.setLayoutManager(new LinearLayoutManager(this));



    }
}