package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.lista.listener.RecycleItemClickListener;

import java.util.ArrayList;
import java.util.List;

import adapter.Adapter;
import model.Filme;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> filmeList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);

        //Listagem
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(filmeList);

        //Configurar recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(
                new RecycleItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecycleItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {

                                Filme filme = filmeList.get(position);
                                Toast.makeText(getApplicationContext(), "Click: " + filme.getTituloFilme(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = filmeList.get(position);
                                Toast.makeText(getApplicationContext(), "Click longo: " + filme.getTituloFilme(), Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }



    public void criarFilmes(){

        Filme filme = new Filme("Policiais em apuros", "Comédia", "2000");
        this.filmeList.add(filme);

        filme = new Filme("Farinha na cumbuca", "Terror", "2018");
        filmeList.add(filme);

        filme = new Filme("Farinha na cumbuca 2", "Terror", "2020");
        filmeList.add(filme);

        filme = new Filme("Não! Não Olhe!", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("Sorria", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("O Telefone Preto", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("Os Inocentes", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("Hereditário", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("Grave", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("Corra!", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("O Iluminado", "Terror", "2023");
        filmeList.add(filme);

        filme = new Filme("A Bruxa", "Terror", "2023");
        filmeList.add(filme);
    }
}