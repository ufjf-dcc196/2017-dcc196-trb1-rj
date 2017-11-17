package br.com.oak.ifeira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                Intent intent = new Intent(MainActivity.this ,CadReserva.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button btnCadLivro = (Button) findViewById(R.id.btnCadLivro);

        btnCadLivro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,CadLivro.class);
                MainActivity.this.startActivity(intent);
            }
        });

        Button btnCadPessoa = (Button) findViewById(R.id.btnCadPessoa);

        btnCadPessoa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,CadPessoa.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
