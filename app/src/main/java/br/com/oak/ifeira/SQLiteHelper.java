package br.com.oak.ifeira;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Guilherme on 03/12/2017.
 */

public class SQLiteHelper extends SQLiteOpenHelper{

    private Context ctx;
    private static final int DATABASE_VERSION = 1;

    public SQLiteHelper(Context ctx)
    {
        this.ctx = ctx;
    }

    public SQLiteDatabase getDb()
    {
        return SQLiteDatabase.openOrCreateDatabase(ctx.getDatabasePath("db_ifeira"),null);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(iFeiraContract.Participante.SQL_CREATE_PARTICIPANTE);
        db.execSQL(iFeiraContract.Livro.SQL_CREATE_LIVRO);
        db.execSQL(iFeiraContract.Reserva.SQL_CREATE_RESERVA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL(iFeiraContract.Participante.SQL_DROP_PARTICIPANTE);
        db.execSQL(iFeiraContract.Livro.SQL_DROP_LIVRO);
        db.execSQL(iFeiraContract.Reserva.SQL_DROP_RESERVA);
        onCreate(db);
    }
}
