package com.kevin.projectspatterns.singleton;
/*
*   Singleton Lazy
*   @author Kevin
*/
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {}

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}

