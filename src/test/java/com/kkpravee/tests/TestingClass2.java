package com.kkpravee.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestingClass2 {

    @Test(description = "Test1 printing that will be Passed.")
    public void test1(){
        System.out.println("Test1 printing that will be Passed.");
        assertEquals("praveen", "praveen");
    }

    @Test(description = "Test2 printing that will be Failed.")
    public void test2(){
        System.out.println("Test2 printing that will be Failed.");
        assertEquals("praveen", "pavan");
    }

    @Test(description = "Test3 printing that will be Passed.")
    public void test3(){
        System.out.println("Test3 printing that will be Passed.");
        assertEquals("pavan", "pavan");
    }
}
