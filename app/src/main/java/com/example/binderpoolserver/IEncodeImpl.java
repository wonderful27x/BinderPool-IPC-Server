package com.example.binderpoolserver;

import android.os.RemoteException;
import android.util.Log;

import com.example.aidl.IEncode;

public class IEncodeImpl extends IEncode.Stub {

    private static final String TAG = "IEncodeImpl";

    @Override
    public String encode(String content) throws RemoteException {
        Log.e(TAG,content);
        return content + "encode";
    }
}
