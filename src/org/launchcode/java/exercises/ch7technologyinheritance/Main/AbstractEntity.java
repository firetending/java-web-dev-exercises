package org.launchcode.java.exercises.ch7technologyinheritance.Main;

public abstract class AbstractEntity {
    private final int uniqueId;
    private static int nextId = 1;

    public AbstractEntity() {
        this.uniqueId = nextId;
        nextId++;
    }

    public int getUniqueId() {
        return this.uniqueId;
    };
}
