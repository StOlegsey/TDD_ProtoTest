package org.example;

import java.lang.reflect.Method;

public class TestCase extends TestSuite{
    String name;

    public TestCase(){

    }
    public TestCase(String name){
        this.name = name;
    }
    public TestResult run(TestResult result) {
        result.testStarted();
        try{
            setUp();
        }
        catch (Exception e){
            result.setUpFailed();
            return result;
        }

        try {
            Method method = this.getClass().getMethod(this.name);
            method.invoke(this);
        } catch (Exception e) {
           result.testFailed();
        }

        tearDown();

        return result;
    }

    public void tearDown() {
    }

    public void setUp() throws Exception {
    }
}
