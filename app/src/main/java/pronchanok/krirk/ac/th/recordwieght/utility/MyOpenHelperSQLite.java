package pronchanok.krirk.ac.th.recordwieght.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HP on 30/1/2561.
 */

public class MyOpenHelperSQLite extends SQLiteOpenHelper{

    //    Explicit
    private Context context;
    public static final String databaseName = "Weight.db";
    public static final int databaseVersion = 1;
    private static final String databaseDetailuserTABLE = "create table userTABLE(" +
            "id integer primary key, " +
            "StartApp text, " +
            "Weight text, " +
            "Height text, " +
            "Gender text, " +
            "Age text, " +
            "NickName text);";

    private static final String databaseDetaildailyTABLE = "create table dailyTABLE(" +
            "id integer primary key," +
            "DateCheck text," +
            "Weight text);";

    public MyOpenHelperSQLite(Context context) {
        super(context, databaseName, null, databaseVersion);
        this.context = context;

    }// Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(databaseDetailuserTABLE);
        sqLiteDatabase.execSQL(databaseDetaildailyTABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}// Main Class
