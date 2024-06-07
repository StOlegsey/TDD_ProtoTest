package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCaseTest {

    TestResult result = new TestResult();

    @Test
    public void testTemplateMethod(){
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assertEquals("1 run. 0 failed", result.summary());
    }

    @Test
    public void testFailedResult(){
        WasRun test = new WasRun("testBrokenMethod");
        test.run(result);
        assertEquals("1 run. 1 failed", result.summary());
    }

    @Test
    public void testSuite(){

        TestCase test = new TestCase();

        test.add(new WasRun("testMethod"));
        test.add(new WasRun("testBrokenMethod"));
        test.runTests(result);
        assertEquals("2 run. 1 failed", result.summary());
    }

    @Test
    public void tearDownCalled(){
        WasRun test = new WasRun("testBrokenMethod");
        test.run(result);
        assertEquals("setUp tearDown", test.log);
    }

    /*@Test
    public void testSetUpFailed(){
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assertEquals("Set Up failed", result.summary());
    }*/
}
