package com.group.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation5 {

    @Test
    public void setup() {
        System.out.println("This is setup test5");
    }

    @Test
    public void register() {
        System.out.println("This is register test5");
    }

    @Test
    public void login() {
        System.out.println("This is login test5");
    }

    @Test
    public void doStuff() {
        System.out.println("This test5 do something");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("This will execute before suit");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("This will execute after suit");
    }
}
