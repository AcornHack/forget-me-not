package com.forgetmenot.forgetmenot.db;

import android.provider.BaseColumns;

public class MemoContract {
    public static final String DB_NAME = "com.forgetmenot.forgetmenot.db.memos";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "memos";

    public class Columns {
        public static final String MEMO = "task";
        public static final String _ID = BaseColumns._ID;
    }

}
