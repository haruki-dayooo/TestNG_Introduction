package com.group.annotations;

import org.testng.annotations.*;

public class Annotation4 {

    @Test
    public void setup() {
        System.out.println("This is setup test4");
    }

    @Test
    public void register() {
        System.out.println("This is register test4");
    }

    @Test
    public void login() {
        System.out.println("This is login test4");
    }

    @Test
    public void doStuff() {
        System.out.println("This test4 do something");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after test");
    }
}
