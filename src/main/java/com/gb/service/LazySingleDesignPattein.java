package com.gb.service;

public class LazySingleDesignPattein {
    private static LazySingleDesignPattein instance = null;

    private LazySingleDesignPattein() {
    }
    private volatile Object object = new Object();
    //非线程安全
    public LazySingleDesignPattein getInstance(){
        if (instance==null){
            instance = new LazySingleDesignPattein();
        }
        return instance;
    }
    //线程安全 -- 双重检查锁
    public LazySingleDesignPattein getInstanceByDoubleCheck(){
        if (instance == null){
            synchronized (object){
                if (instance==null){
                    instance = new LazySingleDesignPattein();
                }
            }
        }
        return instance;
    }

}
