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
    private static final String DATABASE_NAME = "iFeira.db";

    public SQLiteHelper(Context ctx)
    {
        super(ctx,DATABASE_NAME,null, DATABASE_VERSION);
    }

    public SQLiteDatabase getDb()
    {
        return SQLiteDatabase.openOrCreateDatabase(ctx.getDatabasePath("db_ifeira"),null);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(iFeiraContract.Participante.SQL_CREATE_PARTICIPANTE);
        sqLiteDatabase.execSQL(iFeiraContract.Livro.SQL_CREATE_LIVRO);
        sqLiteDatabase.execSQL(iFeiraContract.Reserva.SQL_CREATE_RESERVA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(iFeiraContract.Participante.SQL_DROP_PARTICIPANTE);
        sqLiteDatabase.execSQL(iFeiraContract.Livro.SQL_DROP_LIVRO);
        sqLiteDatabase.execSQL(iFeiraContract.Reserva.SQL_DROP_RESERVA);
        onCreate(sqLiteDatabase);
    }
}
