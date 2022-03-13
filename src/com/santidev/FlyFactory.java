package com.santidev;

public abstract class FlyFactory {

    public static Fly create(int type){
        Fly fly = null;
        if (type == 1){
            fly = new Banshee();
        }else if(type == 2){
            fly = new B747Fly();
        }else if(type == 3){
            fly = new A380Fly();
        }

        return fly;
    }
}
