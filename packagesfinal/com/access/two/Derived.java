package com.access.two;

import com.access.one.Base;

public class Derived extends Base {
    public void showAccessInDerived() {
        System.out.println("\n--- Access in Derived (Subclass from Another Package) ---");

        publicMethod();      // ✅ Accessible (public)
        protectedMethod();   // ✅ Accessible (protected + inheritance)
        // defaultMethod();  // ❌ Not accessible (package-private)
        // privateMethod();  // ❌ Not accessible (private)
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.showAccessInDerived();

        // Try accessing through object reference of Base
        Base base = new Base();
        System.out.println("\n--- Access Base object from Derived ---");
        base.publicMethod();      // ✅ Accessible (public)
        // base.protectedMethod(); // ❌ Not accessible (not through reference, only via inheritance)
        // base.defaultMethod();   // ❌ Not accessible (package-private)
        // base.privateMethod();   // ❌ Not accessible (private)
    }
}
