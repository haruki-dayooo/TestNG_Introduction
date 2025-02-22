package com.group.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.group.listeners.CustomListener.class)
public class Listener {

    @Test
    void test1() {
        System.out.println("This is test1");
        Assert.assertEquals("A", "A");
    }

    @Test
    void test2() {
        System.out.println("This is test2");
        Assert.assertEquals("B", "A");
    }

    @Test
    void test3() {
        System.out.println("This is test3");
        throw new SkipException("This is skip exception");
    }
}
