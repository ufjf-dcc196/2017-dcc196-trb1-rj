package br.com.oak.ifeira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static ArrayList<Livro> livros = new ArrayList<>();
    public static ArrayList<Reserva> reservas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button create and event bindings
        Button btnCadReserva = (Button) findViewById(R.id.btnCadReserva);

        btnCadReserva.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() ,CadReserva.class);
                startActivity(intent);
            }
        });

        Button btnCadLivro = (Button) findViewById(R.id.btnCadLivro);

        btnCadLivro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() ,CadLivro.class);
                startActivity(intent);
            }
        });

        Button btnCadPessoa = (Button) findViewById(R.id.btnCadPessoa);

        btnCadPessoa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() ,CadPessoa.class);
                startActivity(intent);
            }
        });

        ListView listaDePessoas = (ListView) findViewById(R.id.lstPessoas);

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this,
                android.R.layout.simple_list_item_1, pessoas);

        listaDePessoas.setAdapter(adapter);

    }
}
