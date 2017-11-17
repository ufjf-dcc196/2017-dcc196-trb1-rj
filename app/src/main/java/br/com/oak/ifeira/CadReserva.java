package br.com.oak.ifeira;

/**
 * Created by Teco on 31/10/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CadReserva extends AppCompatActivity {

    private Spinner spLivro;
    private Spinner spPessoa;
    private Button btnReservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_reserva);

        spLivro = (Spinner) findViewById(R.id.spLivro);

        ArrayAdapter<Livro> adapterLivro = new ArrayAdapter<Livro>(this,
                android.R.layout.simple_list_item_1, MainActivity.livros);

        spLivro.setAdapter(adapterLivro);

        spPessoa = (Spinner) findViewById(R.id.spPessoa);

        ArrayAdapter<Pessoa> adapterPessoa = new ArrayAdapter<Pessoa>(this,
                android.R.layout.simple_list_item_1, MainActivity.pessoas);

        spPessoa.setAdapter(adapterPessoa);

        btnReservar = (Button) findViewById(R.id.btnReservar);

        btnReservar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Livro livro = (Livro) spLivro.getSelectedItem();
                Pessoa pessoa = (Pessoa) spPessoa.getSelectedItem();

                Reserva reserva = new Reserva(pessoa,livro);

                MainActivity.reservas.add(reserva);

                Intent intent = new Intent(CadReserva.this ,MainActivity.class);
                CadReserva.this.startActivity(intent);

                Toast.makeText(CadReserva.this, "A reserva foi cadastrada com sucesso.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
