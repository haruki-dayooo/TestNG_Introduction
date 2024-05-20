package com.group.prioritizing_disabling;

import org.testng.annotations.Test;

public class Disabling {

    @Test(priority = 2)
    public void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 4)
    public void register() {
        System.out.println("This is register test");
    }

    @Test(priority = 1, enabled = false)
    public void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3, enabled = false)
    public void doStuff() {
        System.out.println("This test do something");
    }
}
