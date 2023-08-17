package com.example.powerfit;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    static String DBNAME = "PowerFit.db";
    static int VERSION = 1;

    static String   TABLE_USER = "User";
    static String COL_USERNAME = "username";
    static String COL_EMAIL = "emailId";
    static String COL_PASSWORD = "password";

    static final String CREATE_TABLE_USER = "CREATE TABLE " + TABLE_USER + " ("
            + COL_USERNAME + " TEXT PRIMARY KEY, "
            + COL_EMAIL + " TEXT, "
            + COL_PASSWORD + " TEXT);";

    static final String DROP_TABLE_USER = "DROP TABLE IF EXISTS " + TABLE_USER;

    public DBHelper(Context context) {
        super(context, DBNAME, null, VERSION);
        context.openOrCreateDatabase(DBNAME, context.MODE_PRIVATE, null);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE_USER);
        onCreate(db);
    }

    public boolean InsertUser(User objUser) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_USERNAME, objUser.getUname());
        cv.put(COL_EMAIL, objUser.getEmailid());
        cv.put(COL_PASSWORD, objUser.getPasswd());
        long result = db.insert(TABLE_USER, null, cv);
        return ((result == -1) ? false : true);
    }
}
