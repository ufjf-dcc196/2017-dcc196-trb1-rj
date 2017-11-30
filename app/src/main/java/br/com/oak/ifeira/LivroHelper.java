package br.com.oak.ifeira;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Teco on 30/11/2017.
 */

public class LivroHelper {

    private SQLiteDatabase db;

    public LivroHelper(SQLiteDatabase db) {
        this.db = db;
        criaTabela();
    }

    private void criaTabela() {
        try {
            db.execSQL("CREATE TABLE IF NOT EXISTS livro (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo VARCHAR, editora VARCHAR, ano INTEGER)");
        }catch (Exception e){
            Log.e("Livro", "Erro ao criar a tabela!");
            Log.e("Livro", e.getMessage());
        }
    }

    public void criarLivro(Livro l){
        try{
            db.execSQL("INSERT INTO livro (titulo, editora, ano) VALUES ('" +
                    l.getTitulo()+"', '" +
                    l.getEditora()+"', " +
                    l.getAno()+", " +")");

        }catch(Exception e){
            Log.e("Livro", "Erro ao inserir um livro");
            Log.e("Livro", e.getLocalizedMessage());
        };
    }

    public List<Livro> listarTodos() {
        Cursor resultado = db.rawQuery("SELECT titulo, autor, editora, ano, preco FROM livro", null);
        List<Livro> livros = new ArrayList<>();
        resultado.moveToPosition(-1);
        while (resultado.moveToNext()){
            Livro l = new Livro();
            l.setTitulo(resultado.getString(0));
            l.setEditora(resultado.getString(1));
            l.setAno(resultado.getInt(2));
            livros.add(l);
        }
        return livros;
    }

}
