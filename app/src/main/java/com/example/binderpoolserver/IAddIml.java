package com.example.binderpoolserver;

import android.os.RemoteException;

import com.example.aidl.IAdd;

public class IAddIml extends IAdd.Stub {

    @Override
    public int add(int a,int b) throws RemoteException {
        return a+b;
    }
}
