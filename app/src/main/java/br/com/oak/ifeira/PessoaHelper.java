package br.com.oak.ifeira;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Teco on 30/11/2017.
 */

public class PessoaHelper extends SQLiteHelper{

    private SQLiteDatabase db;

    public PessoaHelper(Context ctx) {
        super(ctx);
        this.db = super.getDb();
        criaTabela();
    }

    private void criaTabela() {
        try {
            db.execSQL("CREATE TABLE IF NOT EXISTS pessoa (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, email VARCHAR)");
        }catch (Exception e){
            Log.e("Pessoa", "Erro ao criar a tabela!");
            Log.e("Pessoa", e.getMessage());
        }
    }

    public void criarPessoa(Pessoa p){
        try{
            db.execSQL("INSERT INTO pessoa (nome, email) VALUES ('" +
                    p.getNome()+"', '" +
                    p.getEmail()+"')");

        }catch(Exception e){
            Log.e("Pessoa", "Erro ao inserir uma pessoa");
            Log.e("Pessoa", e.getLocalizedMessage());
        };
    }

    public ArrayList<Pessoa> listarTodos() {
        Cursor resultado = db.rawQuery("SELECT nome, email FROM pessoa", null);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        resultado.moveToPosition(-1);
        while (resultado.moveToNext()){
            Pessoa p = new Pessoa();
            p.setNome(resultado.getString(0));
            p.setEmail(resultado.getString(1));
            pessoas.add(p);
        }
        return pessoas;
    }

}
