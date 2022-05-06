package com.kevin.projectspatterns.strategy;

public class CommonBehavior implements Behavior {

    @Override
    public void toMove() {
        System.out.println("Movendo normalmente...");
    }
}
