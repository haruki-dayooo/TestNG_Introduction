package com.group.annotations;

import org.testng.annotations.*;

public class Annotation3 {

    @Test
    public void setup() {
        System.out.println("This is setup test3");
    }

    @Test
    public void register() {
        System.out.println("This is register test3");
    }

    @Test
    public void login() {
        System.out.println("This is login test3");
    }

    @Test
    public void doStuff() {
        System.out.println("This test3 do something");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before Annotation 3");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after Annotation 3");
    }
}
