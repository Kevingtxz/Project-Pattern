package com.kevin.projectspatterns.strategy;

public class AggressiveBehavior implements Behavior {

    @Override
    public void toMove() {
        System.out.println("Movendo agressivamente...");
    }
}
