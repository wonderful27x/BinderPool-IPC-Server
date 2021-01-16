package com.example.binderpoolserver;

import android.os.IBinder;
import android.os.RemoteException;

import com.example.aidl.IBinderPool;

//binder 连接池，模拟一种场景：在一个较大的项目中有多个模块分别使用了不同的aidl（假设它们都在同一进程）
//为了提高效率，只提供一个Service来处理，这就需要用到binder连接池的思想
public class BinderPool {
    public static final int BINDER_ADD = 0;
    public static final int BINDER_ENCODE = 1;

    //BinderPool的实现类，用于查询与用户匹配的binder
    public static class IBinderPoolImpl extends IBinderPool.Stub {

        @Override
        public IBinder queryBinder(int code) throws RemoteException {
            switch (code){
                case BINDER_ADD:
                    return  new IAddIml();
                case BINDER_ENCODE:
                    return new IEncodeImpl();
                default:
                    break;
            }
            return null;
        }
    }
}
