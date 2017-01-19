package com.nhahv.greendao;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by nhahv on 1/19/2017.
 */
public class Applications extends Application {
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db");
        Database db = helper.getWritableDb();
        mDaoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
