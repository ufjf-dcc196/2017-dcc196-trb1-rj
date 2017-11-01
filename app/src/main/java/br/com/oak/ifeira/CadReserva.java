package br.com.oak.ifeira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class CadReserva extends AppCompatActivity {

    private Spinner spLivro;
    private Spinner spPessoa;
    private Button btnReservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_reserva);

        spLivro = (Spinner) findViewById(R.id.spLivro);
        spPessoa = (Spinner) findViewById(R.id.spPessoa);
        btnReservar = (Button) findViewById(R.id.btnReservar);

        btnReservar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //logica
            }
        });
    }
}
