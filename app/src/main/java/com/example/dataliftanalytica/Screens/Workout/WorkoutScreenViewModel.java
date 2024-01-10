package com.example.dataliftanalytica.Screens.Workout;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class WorkoutScreenViewModel {
    private static final String DB_NAME = "dataLift";
    //@Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        /*String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + DURATION_COL + " TEXT,"
                + DESCRIPTION_COL + " TEXT,"
                + TRACKS_COL + " TEXT)";
        */
        // at last we are calling a exec sql
        // method to execute above sql query
        //db.execSQL(query);
    }


    //new workout function
    //add exercise to current workout \input: exercise values

    //delete exercise from current workout

    //edit exercise \input: which exercise and changes

    //finish workout and send it to SQLite db
    //db.insert(tablename

    //open and edit existing workout

    //gather and list workouts in tabulation sorted by their dates
}
