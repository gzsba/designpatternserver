package com.gb.service;
//单例模式
public class HungrySingleDesignPattein {
    public static HungrySingleDesignPattein instance = new HungrySingleDesignPattein();

    private HungrySingleDesignPattein() {
    }

    //饿汉式单例模式
    public HungrySingleDesignPattein hungryGetInstance(){
        return instance;
    }

}
