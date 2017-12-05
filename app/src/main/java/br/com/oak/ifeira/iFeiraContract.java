package br.com.oak.ifeira;

/**
 * Created by Franc on 05/12/2017.
 */

import android.provider.BaseColumns;

final class iFeiraContract {

    private static final String TYPE_TEXT = " VARCHAR";
    private static final String TYPE_INT = " INTEGER";
    private static final String SEP = ", ";

    static class Participante implements BaseColumns {
        static final String TABLE_NAME = "participante";
        static final String COLUMN_NAME_NOME ="nome";
        static final String COLUMN_NAME_EMAIL ="email";
        static final String COLUMN_NAME_HORA_ENTRADA ="horaEntrada";
        static final String COLUMN_NAME_HORA_SAIDA ="horaSaida";

        static final String SQL_CREATE_PARTICIPANTE = "CREATE TABLE "+
                Participante.TABLE_NAME+" ("+
                Participante._ID+TYPE_INT+
                " PRIMARY KEY AUTOINCREMENT"+SEP+
                Participante.COLUMN_NAME_NOME+TYPE_TEXT+SEP+
                Participante.COLUMN_NAME_EMAIL+TYPE_TEXT+SEP+
                Participante.COLUMN_NAME_HORA_ENTRADA+TYPE_TEXT+SEP+
                Participante.COLUMN_NAME_HORA_SAIDA+TYPE_TEXT+")";

        static final String SQL_DROP_PARTICIPANTE = "DROP TABLE IF EXISTS "+
                Participante.TABLE_NAME;

        static final String SQL_SELECT_PARTICIPANTE = "SELECT * FROM "+
                Participante.TABLE_NAME;
    }

    static class Livro implements BaseColumns {
        static final String TABLE_NAME = "livro";
        static final String COLUMN_NAME_TITULO ="titulo";
        static final String COLUMN_NAME_EDITORA ="editora";
        static final String COLUMN_NAME_ANO_PUBLICACAO ="anoPublicacao";

        static final String SQL_CREATE_LIVRO = "CREATE TABLE "+
                Livro.TABLE_NAME+" ("+
                Livro._ID+TYPE_INT+
                " PRIMARY KEY AUTOINCREMENT"+SEP+
                Livro.COLUMN_NAME_TITULO+TYPE_TEXT+SEP+
                Livro.COLUMN_NAME_EDITORA+TYPE_TEXT+SEP+
                Livro.COLUMN_NAME_ANO_PUBLICACAO+TYPE_INT+")";

        static final String SQL_DROP_LIVRO = "DROP TABLE IF EXISTS "+
                Livro.TABLE_NAME;

        static final String SQL_SELECT_LIVRO = "SELECT * FROM "+
                Livro.TABLE_NAME;
    }

    static class Reserva implements BaseColumns {
        static final String TABLE_NAME = "reserva";
        static final String COLUMN_NAME_PARTICIPANTE ="participante";
        static final String COLUMN_NAME_LIVRO ="livro";

        static final String SQL_CREATE_RESERVA= "CREATE TABLE "+
                Reserva.TABLE_NAME+" ("+
                Reserva._ID+TYPE_INT+ " PRIMARY KEY AUTOINCREMENT"+SEP+
                Reserva.COLUMN_NAME_PARTICIPANTE+TYPE_INT+SEP+
                Reserva.COLUMN_NAME_LIVRO+TYPE_INT+SEP+
                "FOREIGN KEY ("+Reserva.COLUMN_NAME_PARTICIPANTE+") REFERENCES "
                +Participante.TABLE_NAME+" ("+Participante._ID+")"+SEP+
                "FOREIGN KEY ("+Reserva.COLUMN_NAME_LIVRO+") REFERENCES "
                +Livro.TABLE_NAME+" ("+Livro._ID+"))";

        static final String SQL_DROP_RESERVA= "DROP TABLE IF EXISTS "+
                Reserva.TABLE_NAME;
    }
}
