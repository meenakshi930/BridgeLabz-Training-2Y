package com.access.one;

public class Base {
    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere.");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within package and by subclass in another package.");
    }

    void defaultMethod() { // No modifier → default (package-private)
        System.out.println("Default Method: Accessible only within the same package.");
    }

    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class.");
    }

    // Helper method to show Base class access
    public void showAccessInBase() {
        System.out.println("\n--- Access within Base class ---");
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
