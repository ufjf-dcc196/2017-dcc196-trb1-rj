package br.com.oak.ifeira;

/**
 * Created by Teco on 31/10/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
                //logica
            }
        });
    }
}
