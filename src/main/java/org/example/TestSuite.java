package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<TestCase> tests = new ArrayList<>();

    public void add(TestCase test){
        tests.add(test);
    }

    public TestResult runTests(TestResult result) {

        for(TestCase t: tests){
            t.run(result);
        }
        return result;
    }
}