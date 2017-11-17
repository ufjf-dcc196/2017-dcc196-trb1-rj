package br.com.oak.ifeira;

/**
 * Created by Teco on 31/10/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadLivro extends AppCompatActivity {

    private TextView txtTitulo;
    private TextView txtEditora;
    private TextView txtAno;
    private Button btnCadastrarLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_livro);

        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtEditora = (TextView) findViewById(R.id.txtEditora);
        txtAno = (TextView) findViewById(R.id.txtAno);
        btnCadastrarLivro = (Button) findViewById(R.id.btnCadastrarLivro);

        btnCadastrarLivro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Livro livro = new Livro();

                txtTitulo.setText(txtTitulo.getText().toString());
                txtEditora.setText(txtEditora.getText().toString());
                txtAno.setText(txtAno.getText().toString());

                MainActivity.livros.add(livro);

                Toast.makeText(CadLivro.this, "O livro foi cadastrado com sucesso.", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CadLivro.this,MainActivity.class);
                CadLivro.this.startActivity(intent);
            }
        });
    }
}
