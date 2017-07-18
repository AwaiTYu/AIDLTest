package com.zjj.android.aidltest;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import com.zjj.android.aidltest.Hkzs;

/**
 * Created by Lenovo on 2017/7/17.
 */

public class BindService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn, int flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }


    public void getIn(String name) {
        Log.d("name",name);
    }

    class MyBinder extends Hkzs.Stub {
        @Override
        public void getAIDLName(String name) throws RemoteException {
            getIn(name);
        }
    }
}
