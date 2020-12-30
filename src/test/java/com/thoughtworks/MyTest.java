package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
    @Test
    public void should_return_hello_when_given_hello(){
        Hello hello = new Hello();
        String str = "hello";
        Assert.assertEquals(str,  hello.print(str));
    }
    @Test
    public void should_contain_ll_when_given_hello(){
        Hello hello = new Hello();
        String str = "hello";
        Assert.assertTrue(hello.print(str).contains("ll"));
    }
}
