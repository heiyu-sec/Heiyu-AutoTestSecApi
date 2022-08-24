package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTesst {
    @Test(timeOut = 3000)//毫秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)//毫秒
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
