package com.kevin.projectspatterns;

import com.kevin.projectspatterns.facade.Facade;
import com.kevin.projectspatterns.singleton.SingletonEager;
import com.kevin.projectspatterns.singleton.SingletonLazy;
import com.kevin.projectspatterns.singleton.SingletonLazyHolder;
import com.kevin.projectspatterns.strategy.*;

public class Test {

    public static void main(String[] args) {

        System.out.println("Singleton\n");

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);


        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);


        System.out.println("\n\nStrategy\n");

        final Behavior common = new CommonBehavior();
        final Behavior aggressive = new AggressiveBehavior();
        final Behavior defensive = new DefenceBehavior();

        Robo robo = new Robo();
        robo.setBehavior(common);
        robo.toMove();
        robo.setBehavior(aggressive);
        robo.toMove();
        robo.setBehavior(defensive);
        robo.toMove();


        System.out.println("\n\nFacade\n");

        Facade.clientMigration("Rodrigo", "1204284");
    }
}
