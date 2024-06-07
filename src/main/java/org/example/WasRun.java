package org.example;

public class WasRun extends TestCase{
    String log;
    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        log += " testMethod";
    }

    public void testBrokenMethod() throws Exception {
        throw new Exception();
    }

    public void setUp() throws Exception {
        log = "setUp";
    }
    public void tearDown(){
        log += " tearDown";
    }
}