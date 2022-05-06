package com.kevin.projectspatterns.strategy;

public class DefenceBehavior implements Behavior {

    @Override
    public void toMove() {
        System.out.println("Movendo defensivamente...");
    }
}
