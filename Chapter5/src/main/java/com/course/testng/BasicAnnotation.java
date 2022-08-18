package com.course.testng;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类之前运行的方法");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("这是在类在类运行之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }

}
