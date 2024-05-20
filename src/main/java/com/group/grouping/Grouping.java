package com.group.grouping;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = "cat")
    public void setup() {
        System.out.println("This is setup test of cat group");
    }

    @Test(groups = "dog")
    public void register() {
        System.out.println("This is register test of dog group");
    }

    @Test(groups = "cat")
    public void login() {
        System.out.println("This is login test of cat group");
    }

    @Test(groups = "dog")
    public void doStuff() {
        System.out.println("This test do something of dog group");
    }

    @Test(groups = {"dog", "cat"})
    public void bothGroups() {
        System.out.println("This test is from both dog cat group");
    }
}
