package com.course.testng;

import org.testng.annotations.Test;

public class ExceptedException {
    /**
     * 期望某个结果为异常的时候使用
     */

//这是测试结果失败的测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeEXceptionFailed(){
    System.out.println("这是个失败的异常测试");
}

//这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();


    }
}
