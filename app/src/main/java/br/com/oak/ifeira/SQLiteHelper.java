package br.com.oak.ifeira;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Guilherme on 03/12/2017.
 */

public class SQLiteHelper {

    private Context ctx;
    public SQLiteHelper(Context ctx)
    {
        this.ctx = ctx;
    }

    public SQLiteDatabase getDb()
    {
        return SQLiteDatabase.openOrCreateDatabase(ctx.getDatabasePath("db_ifeira"),null);
    }
}
