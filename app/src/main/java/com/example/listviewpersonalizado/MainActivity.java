package com.example.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvequipos;
    ArrayList<Equipo> lista_equipos = new ArrayList<Equipo>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();


        lvequipos=(ListView)findViewById(R.id.lvprincipal);

        AdaptadorEquipo adaptador= new AdaptadorEquipo(this, lista_equipos);
        lvequipos.setAdapter(adaptador);



    }


    private void cargarDatos(){

        lista_equipos.add(new Equipo("Boston Celtics", "Boston Garden","bc"));
        lista_equipos.add(new Equipo("Chicago Bulls", "United Center","cb"));
        lista_equipos.add(new Equipo("Cleveland Cavaliers", "Quicken Loans Arena","cc"));
        lista_equipos.add(new Equipo("Golden State Warriors", "SAP Center","gew"));
        lista_equipos.add(new Equipo("Houston Rockets", "Toyota Center","hr"));
        lista_equipos.add(new Equipo("Los Angeles Lakers", "Staples Center","lal"));
        lista_equipos.add(new Equipo("New York Knicks", "Madison Square Garden","nyk"));
        lista_equipos.add(new Equipo("Oklahoma City Thunders", "Ford center","okc"));
        lista_equipos.add(new Equipo("San Antonio Spurs", "AT&T Center","sas"));
        lista_equipos.add(new Equipo("Utah Jazz", "Louisiana Superdome","uj"));
        lista_equipos.add(new Equipo("Sacramento Kings", "Sleep Train Arena","sk"));
    }
}
