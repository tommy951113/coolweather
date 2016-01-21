package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tommy on 2016/1/21.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

    /*
    province 建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province(" +
            "id integer primary key autoincreasement," +
            "province_name text," +
            "province_code text)";

    /*
    city 建表语句
     */
    public static final String CREATE_CITY = "create table City(\n" +
            "id integer primary key autoincreasement,\n" +
            "city_name text,\n" +
            "city_code text,\n" +
            "province_id integer)\n";

    /*
    county建表语句
     */
    public static final String CREATE_COUNTY = "create table County(\n" +
            "id integer primary key autoincreasement,\n" +
            "county_name text,\n" +
            "county_code text,\n" +
            "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
