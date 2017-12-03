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

public class ReservaHelper extends SQLiteHelper {

    private SQLiteDatabase db;

    public ReservaHelper(Context ctx) {
        super(ctx);
        this.db = super.getDb();
        criaTabela();
    }

    private void criaTabela() {
        try {
            db.execSQL("CREATE TABLE IF NOT EXISTS reserva (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo VARCHAR, nome VARCHAR)");
        }catch (Exception e){
            Log.e("Reserva", "Erro ao criar a tabela!");
            Log.e("Reserva", e.getMessage());
        }
    }

    public void criarReserva(Reserva r){
        try{
            db.execSQL("INSERT INTO reserva (titulo, nome) VALUES ('" +
                    r.getLivro().getTitulo()+"', '" +
                    r.getPessoa().getNome()+"', " +")");

        }catch(Exception e){
            Log.e("Reserva", "Erro ao inserir um livro");
            Log.e("Reserva", e.getLocalizedMessage());
        };
    }

    /*
    public List<Reserva> listarTodos() {
        Cursor resultado = db.rawQuery("SELECT titulo, nome FROM reserva", null);
        List<Reserva> reservas = new ArrayList<>();
        resultado.moveToPosition(-1);
        while (resultado.moveToNext()){
            Reserva r = new Reserva(resultado.getString(0),resultado.getString(1));
            reservas.add(r);
        }
        return reservas;
    }
    */

}
