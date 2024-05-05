package com.apsg.utils;

import java.io.File;
import java.io.IOException;

public class AllureReportGenerator {

    public void generateAllureReport() {
        String resultsDir = new File("target/allure-results").getAbsolutePath();
        String allure = new File("src/test/resources/allure/bin/allure.bat").getAbsolutePath();
        ProcessBuilder processBuilder = new ProcessBuilder(allure, "generate", resultsDir, "reportsDir");
        try {
            Process process = processBuilder.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("Unable to generate report");
        }

    }

}
