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

public class CadPessoa extends AppCompatActivity {

    private TextView txtNome;
    private TextView txtEmail;
    private Button btnSalvarPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_pessoa);

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        btnSalvarPessoa = (Button) findViewById(R.id.btnSalvarPessoa);

        btnSalvarPessoa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    //save pessoa
                    Pessoa pessoa = new Pessoa();

                    pessoa.setEmail(txtEmail.getText().toString());
                    pessoa.setNome(txtNome.getText().toString());

                    PessoaHelper db = new PessoaHelper(CadPessoa.this);
                    db.criarPessoa(pessoa);

                    //open main activity
                    Intent intent = new Intent(CadPessoa.this,MainActivity.class);
                    CadPessoa.this.startActivity(intent);

                    Toast.makeText(CadPessoa.this, "A pessoa foi cadastrada com sucesso.", Toast.LENGTH_SHORT).show();
                    finish();
                }
                catch(Exception erro)
                {
                    Toast.makeText(CadPessoa.this, "Ocorreu um erro ao salvar a pessoa.", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
