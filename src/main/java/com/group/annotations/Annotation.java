package com.group.annotations;

import org.testng.annotations.*;

public class Annotation {

    @Test
    public void setup() {
        System.out.println("This is setup test");
    }

    @Test
    public void register() {
        System.out.println("This is register test");
    }

    @Test
    public void login() {
        System.out.println("This is login test");
    }

    @Test
    public void doStuff() {
        System.out.println("This test do something");
    }

}