package utils;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class ExtentLogs {
    public static void log(String message) {
        ExtentCucumberAdapter.addTestStepLog("* " + message);
    }
}
