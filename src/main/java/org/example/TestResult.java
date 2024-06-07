package org.example;

public class TestResult {
    int errorCount;
    int runCount;
    int setUpError;
    public TestResult() {
        this.errorCount = 0;
        this.runCount = 0;
    }

    public void testStarted(){
        runCount++;
    }

    public void testFailed(){
        errorCount++;
    }

    String summary(){
        if(setUpError >= 1){
            return "Set Up failed";
        }
        return runCount+  " run. "+errorCount+" failed";
    }

    public void setUpFailed() {
        setUpError++;
    }
}
