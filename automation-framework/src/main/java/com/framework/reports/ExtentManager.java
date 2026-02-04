package com.framework.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentManager {
    private static ExtentReports extent;

    public static void initReports() {
        try {
            String folder = "reports/extent";
            new File(folder).mkdirs();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(folder + File.separator + "index.html");
            htmlReporter.config().setDocumentTitle("Automation Report");
            htmlReporter.config().setReportName("Automation Results");
            htmlReporter.config().setTheme(Theme.STANDARD);

            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ExtentReports getExtent() {
        return extent;
    }

    public static void flushReports() {
        if (extent != null) extent.flush();
    }
}
