package pronchanok.krirk.ac.th.recordwieght.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by HP on 30/1/2561.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();



    }   // Constructor
}   // Main Class
