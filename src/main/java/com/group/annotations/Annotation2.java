package com.group.annotations;

import org.testng.annotations.*;

public class Annotation2 {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every method in Annotation2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every method in Annotation2");
    }
    @Test
    public void setup() {
        System.out.println("This is setup test2");
    }

    @Test
    public void register() {
        System.out.println("This is register test2");
    }

    @Test
    public void login() {
        System.out.println("This is login test2");
    }

    @Test
    public void doStuff() {
        System.out.println("This test2 do something");
    }
}