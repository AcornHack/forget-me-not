package com.forgetmenot.forgetmenot.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MemoDBHelper extends SQLiteOpenHelper {

    public MemoDBHelper (Context context){
        super(context, MemoContract.DB_NAME, null, MemoContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqlDB){
        String query = String.format("CREATE TABLE %s (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "%s TEXT)", MemoContract.TABLE, MemoContract.Columns.MEMO);

        Log.d("MemoDBHelper", "Query to form table: " + query);
        sqlDB.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqlDB, int i, int i2) {
        sqlDB.execSQL("DROP TABLE IF EXISTS " + MemoContract.TABLE);
        onCreate(sqlDB);
    }
}
