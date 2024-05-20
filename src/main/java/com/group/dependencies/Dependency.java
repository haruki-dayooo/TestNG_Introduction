package com.group.dependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {

    @Test
    public void setup() {
        System.out.println("This is setup test");
    }

    @Test(dependsOnMethods = "setup")
    public void register() {
        System.out.println("This is register test");
        Assert.fail();
    }

    @Test(dependsOnMethods = "register")
    public void login() {
        System.out.println("This is login test");
    }

    @Test(dependsOnMethods = "login", alwaysRun = true)
    public void doStuff() {
        System.out.println("This test do something");
    }
}
